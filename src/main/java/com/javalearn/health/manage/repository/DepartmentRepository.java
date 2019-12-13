package com.javalearn.health.manage.repository;

import com.javalearn.health.manage.entity.Department;
import com.javalearn.health.manage.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author king-pan
 * @date 2019-12-13 12:46
 *
 */
@Transactional(rollbackFor = RuntimeException.class)
public interface DepartmentRepository  extends JpaRepository<Department, Integer>, QuerydslPredicateExecutor<Department>, JpaSpecificationExecutor<Department> {

}