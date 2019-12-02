package com.javalearn.health.manage.service.impl;

import com.javalearn.health.manage.common.BootstrapMessage;
import com.javalearn.health.manage.common.Message;
import com.javalearn.health.manage.entity.Aged;
import com.javalearn.health.manage.entity.DataDict;
import com.javalearn.health.manage.entity.dto.AgedDTO;
import com.javalearn.health.manage.repository.AgedRepository;
import com.javalearn.health.manage.service.AgedService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author king-pan
 * @date 2019/12/2 23:06
 */
@Slf4j
@Service
public class AgedServiceImpl implements AgedService {

    @Autowired
    private AgedRepository agedRepository;

    @Override
    public Message<Aged> getPageList(AgedDTO agedDTO, Pageable pageable) {
        BootstrapMessage<Aged> message = new BootstrapMessage<>();
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        PageRequest pageRequest = new PageRequest(pageable.getPageNumber(), pageable.getPageSize(), sort);

        Page<Aged> dataDictPage = agedRepository.findAll(new Specification<Aged>() {
            @Override
            public Predicate toPredicate(Root<Aged> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Path<String> realNamePath = root.get("realName");
                Path<String> idCardPath = root.get("idCard");
                List<Predicate> wherePredicate = new ArrayList<>();
                if (agedDTO != null) {
                    if (StringUtils.isNoneBlank(agedDTO.getRealName())) {
                        wherePredicate.add(cb.like(realNamePath, "%" + agedDTO.getRealName() + "%"));
                    }
                    if (StringUtils.isNoneBlank(agedDTO.getIdCard())) {
                        wherePredicate.add(cb.like(idCardPath, "%" + agedDTO.getIdCard() + "%"));
                    }
                }
                Predicate[] predicates = new Predicate[]{};
                //这里可以设置任意条查询条件
                if (CollectionUtils.isNotEmpty(wherePredicate)) {
                    query.where(wherePredicate.toArray(predicates));
                }
                //这种方式使用JPA的API设置了查询条件，所以不需要再返回查询条件Predicate给Spring Data Jpa，故最后return null;即可。
                return null;
            }
        }, pageRequest);

        message.setLimit(dataDictPage.getSize());
        message.setRows(dataDictPage.getContent());
        message.setTotal(dataDictPage.getTotalElements());
        message.setStart(dataDictPage.getNumber());
        log.debug("limit=" + dataDictPage.getSize() + ",total=" +
                dataDictPage.getTotalElements() + ",start=" +
                dataDictPage.getNumber() + ",numberOfElements=" +
                dataDictPage.getNumberOfElements());
        return message;
    }
}

