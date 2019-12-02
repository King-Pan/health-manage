package com.javalearn.health.manage.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author king-pan
 * @date 2019/12/2 23:41
 */
@Data
@Entity
@Table(name = "sys_data_dict")
public class DataDict implements Serializable {

    /**
     * 主键字段
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment '主键字段'")
    private Long id;
    /**
     * 父类ID
     */

    private Long parentId;
    /**
     * 类型
     */
    private String type;
    /**
     * 字典code
     */
    private String dictCode;
    /**
     * 字典值
     */
    @Column(length = 4000)
    private String dictValue;
    /**
     * 排序字段
     */
    private int orderNum;
}
