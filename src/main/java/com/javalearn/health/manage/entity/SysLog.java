package com.javalearn.health.manage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author king-pan
 * @date 2019/11/13 1:07
 */
@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(appliesTo = "sys_log",comment = "系统日志表")
public class SysLog extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,columnDefinition = " bigint comment '主键字段'")
    protected Long id;
    @Column(nullable = true,columnDefinition = " text comment '模块名称'")
    private String moduleName;
    @Column(nullable = true,columnDefinition = " text comment '操作描述'")
    private String operation;
    @Column(nullable = true,columnDefinition = " text comment '访问时间'")
    private Long  accessTime;
    @Column(nullable = true,columnDefinition = " text comment '用户ID'")
    private Long userId;
    @Column(nullable = true,columnDefinition = " text comment 'ip'")
    private String ip;
    @Column(nullable = true,columnDefinition = " text comment '方法类型'")
    private String methodType;
    @Column(nullable = true,columnDefinition = " text comment '方法名称'")
    private String methodName;
    @Column(nullable = true,columnDefinition = " text comment '请求参数'")
    private String params;
    @Column(nullable = true,columnDefinition = " text comment '请求返回信息'")
    private String result;
    @Column(nullable = true,columnDefinition = " text comment '错误信息'")
    private String errorMsg;
    @Column(nullable = true,columnDefinition = " int not null default 200 comment '状态码: 200-成功;'")
    private String code;
    @Column(nullable = true,columnDefinition = " int(2) not null default 1 comment '请求状态: 0-失败;1-成功;'")
    private String accessStatus;
    @Column(nullable = true,columnDefinition = " bigint comment '请求耗时'")
    private Long time;
    @Column(nullable = true,columnDefinition = " varchar(255) comment '请求URL'")
    private String url;
    @Column(nullable = false,columnDefinition = " datetime not null default now() comment '通用属性新增时间'")
    private LocalDateTime createTime;
    @Column(nullable = true,columnDefinition = " datetime comment '通用属性更新时间'")
    private LocalDateTime updateTime;
    @Column(nullable = false,columnDefinition = " int(2)  not null default 1 comment '通用属性数据状态: 0-未启用;1-启用;2-删除'")
    private Integer status;
}
