package com.javalearn.health.manage.repository;

import com.javalearn.health.manage.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author king-pan
 * @date 2019/12/2 23:02
 */
@Transactional(rollbackFor = RuntimeException.class)
public interface SysLogRepository extends JpaRepository<SysLog, Long>, QuerydslPredicateExecutor<SysLog>, JpaSpecificationExecutor<SysLog> {
}
