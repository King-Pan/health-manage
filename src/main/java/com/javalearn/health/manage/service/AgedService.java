package com.javalearn.health.manage.service;

import com.javalearn.health.manage.common.Message;
import com.javalearn.health.manage.entity.Aged;
import com.javalearn.health.manage.entity.DataDict;
import com.javalearn.health.manage.entity.dto.AgedDTO;
import org.springframework.data.domain.Pageable;

/**
 * @author king-pan
 * @date 2019/12/2 23:06
 */
public interface AgedService {
    public Message<Aged> getPageList(AgedDTO agedDTO, Pageable pageable);
}
