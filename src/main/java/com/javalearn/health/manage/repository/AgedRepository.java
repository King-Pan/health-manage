package com.javalearn.health.manage.repository;

import com.javalearn.health.manage.entity.Aged;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author king-pan
 * @date 2019/12/2 22:58
 */
@Transactional(rollbackFor = RuntimeException.class)
public interface AgedRepository extends JpaRepository<Aged, Long>, QuerydslPredicateExecutor<Aged>, JpaSpecificationExecutor<Aged> {

}
