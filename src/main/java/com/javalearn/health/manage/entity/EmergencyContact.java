package com.javalearn.health.manage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author king-pan
 * @date 2019-12-12 14:19
 * 紧急联系人
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@org.hibernate.annotations.Table(appliesTo = "emergency_contact", comment = "老人-紧急联系人")
public class EmergencyContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = " bigint comment '主键字段'")
    private Long id;
    @Column(nullable = false, columnDefinition = " bigint comment '老人ID'")
    private Long agedId;
    @Column(nullable = true, columnDefinition = " varchar(64) comment '姓名'")
    private String name;
    @Column(nullable = true, columnDefinition = " varchar(64) comment '身份证'")
    private String idCard;
    @Column(nullable = true, columnDefinition = " varchar(64) comment '地址'")
    private String address;
    @Column(nullable = true, columnDefinition = " varchar(64) comment '电话'")
    private String phoneNum;
    @Column(nullable = true, columnDefinition = " int(2) comment '关系'")
    private String relationship;
}
