package com.javalearn.health.manage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Table;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author king-pan
 * @date 2019/12/4 23:06
 */
@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(appliesTo = "sys_user",comment = "系统用户表")
public class SysUser extends BaseEntity {
    @Id
    @Column(columnDefinition="bigint COMMENT '用户ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nick_name",columnDefinition="varchar(255) COMMENT '用户昵称'")
    private String nickName;
    @Column(name = "real_name",columnDefinition="varchar(255) COMMENT '真实姓名'")
    private String realName;
    @Column(name = "user_name",columnDefinition="varchar(255) COMMENT '登录用户名'")
    private String userName;
    @Column(name = "phone_num",columnDefinition="varchar(11) COMMENT '手机号码'")
    private String phoneNum;
    @Column(name = "salt",columnDefinition="varchar(255) COMMENT '加密盐'")
    private String salt;
    @Column(name = "password",columnDefinition="varchar(64) COMMENT '密码'")
    private String password;
    @Column(name = "email",columnDefinition="varchar(40) COMMENT '邮箱'")
    private String email;
    @Column(name = "status",columnDefinition="varchar(255) COMMENT '状态'")
    private Integer status;
    @Column(name = "create_time",columnDefinition="timestamp COMMENT '创建时间'")
    @CreationTimestamp
    private Timestamp createTime;
    @Column(name = "update_time",columnDefinition="timestamp COMMENT '更新时间'")
    @UpdateTimestamp
    private Timestamp updateTime;
}
