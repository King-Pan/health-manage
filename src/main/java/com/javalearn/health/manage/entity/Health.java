package com.javalearn.health.manage.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author king-pan
 * @date 2019/12/7 9:04
 */
@Data
@NoArgsConstructor
@Entity
@javax.persistence.Table(name = "aged_health")
@Table(appliesTo = "aged_health",comment = "老人健康信息表")
public class Health extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long agedId;
    private Date checkUpDate;
    private String key1;
    private String val1;
    private String key2;
    private String val2;
    private String key3;
    private String val3;
    private String key4;
    private String val4;
}
