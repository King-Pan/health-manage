package com.javalearn.health.manage.repository;

import com.javalearn.health.manage.entity.Aged;
import com.javalearn.health.manage.entity.Health;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @author king-pan
 * @date 2019/12/7 9:14
 */
public interface HealthRepository extends JpaRepository<Health, Long>, QuerydslPredicateExecutor<Health>, JpaSpecificationExecutor<Health> {
}
