package com.javalearn.health.manage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(appliesTo = "aged_info",comment = "老人基础信息-扩展表")
public class AgedInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,columnDefinition = " bigint comment '主键字段'")
    private Long id;

    @JoinColumn(name = "aged_id", unique = true)
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Aged aged;

    @Column(nullable = false,columnDefinition = " varchar(256) comment '家庭住址'")
    private String address;
    @Column(nullable = true,columnDefinition = " int comment '学历'")
    private String education;
    @Column(nullable = true,columnDefinition = " int comment '自理'")
    private String zlType;
    @Column(nullable = true,columnDefinition = " int comment '入住状态'")
    private Integer checkInStatus;
    @Column(nullable = false,columnDefinition = " datetime not null default now() comment '通用属性新增时间'")
    private LocalDateTime createTime;
    @Column(nullable = false,columnDefinition = " datetime comment '通用属性更新时间'")
    private LocalDateTime updateTime;
    @Column(nullable = false,columnDefinition = " int(2) comment '通用属性数据状态: 0-未启用;1-启用;2-删除'")
    private Integer status;

    @Override
    public String toString() {
        return "AgedInfo{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", zlType='" + zlType + '\'' +
                ", checkInStatus=" + checkInStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}
