package com.javalearn.health.manage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;

/**
 * @author king-pan
 * @date 2019/12/4 23:21
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(appliesTo = "reservation_info", comment = "预约信息表")
public class ReservationInfo {
    @Id
    @Column(columnDefinition = "bigint COMMENT '预约信息ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", columnDefinition = "varchar(20) COMMENT '老人姓名'")
    private String name;
    @Column(name = "id_card", columnDefinition = "varchar(20) COMMENT '老人身份证号码'")
    private String idCard;
    @Column(name = "sex", columnDefinition = "int COMMENT '性别: 0:男性;1:女性;2:保密'")
    private String sex;
    @Column(name = "zl_type", columnDefinition = "int COMMENT '自理情况: 1:白日会员;2:自理;3:介助;4:介护;5:其他'")
    private Integer zlType;
    @Column(name = "check_in_date", columnDefinition = "date COMMENT '预约入住时间'")
    private Date checkInDate;
    @Column(name = "bed_type", columnDefinition = "int COMMENT '床位类型: 1:一级;2:二级;3:三级;4:特级;'")
    private Integer bedType;
    @Column(name = "bed_id", columnDefinition = "int COMMENT '床位ID'")
    private Long bedId;
    @Column(name = "room_id", columnDefinition = "bigint COMMENT '房间ID'")
    private Long roomId;
    @Column(name = "remark", columnDefinition = "text COMMENT '预约备注信息'")
    private String remark;
    @Column(name = "address", columnDefinition = "varchar(256) COMMENT '老人家庭住址'")
    private String address;
    @Column(name = "reservation_name", columnDefinition = "varchar(64) COMMENT '预约人姓名'")
    private String reservationName;
    @Column(name = "phone_num", columnDefinition = "varchar(11) COMMENT '预约人电话'")
    private String phoneNum;
    @Column(name = "ship_type", columnDefinition = "int COMMENT '1:配偶;2:子女;3:其他'")
    private Integer shipType;
    @Column(name = "reservation_date", columnDefinition = "date COMMENT '预约时间'")
    private Date reservationDate;
}
