package com.javalearn.health.manage.entity;

import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author king-pan
 * @date 2019/11/13 1:10
 */
@Getter
@Setter
@Entity
@Table(appliesTo = "aged", comment = "老人基础信息表")
public class Aged extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = " bigint comment '主键字段'")
    private Long id;
    @Column(nullable = true, columnDefinition = " date  comment '出生年月日'")
    private LocalDate birthDay;
    @Column(nullable = false, length = 11, columnDefinition = " varchar(11) comment '手机号码'")
    private String phoneNum;
    @Column(nullable = false, columnDefinition = " varchar(20) not null default 0 comment '真实姓名'")
    private String realName;
    @Column(nullable = false, columnDefinition = " varchar(20) not null default 0 comment '身份证号码'")
    private String idCard;


    @OneToOne(mappedBy = "aged")
    private AgedInfo agedInfo;

    @Column(nullable = false, columnDefinition = " datetime not null default now() comment '通用属性新增时间'")
    private LocalDateTime createTime;
    @Column(nullable = false, columnDefinition = " datetime comment '通用属性更新时间'")
    private LocalDateTime updateTime;
    @Column(nullable = false, columnDefinition = " int(2) comment '通用属性数据状态: 0-未启用;1-启用;2-删除'")
    private Integer status;

    @Override
    public String toString() {
        return "Aged{" +
                "id=" + id +
                ", birthDay=" + birthDay +
                ", phoneNum='" + phoneNum + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", ageInfo=" + agedInfo +
                '}';
    }
}
