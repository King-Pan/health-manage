package com.javalearn.health.manage.entity;

import javax.persistence.*;

/**
 * @author king-pan
 * @date 2019-12-13 12:35
 */
@Table(name="JPA_MANAGERS")
@Entity
public class Manager {

    private Integer id;
    private String mgrName;

    private Department dept;


    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="MGR_NAME")
    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }
    /**
     * 对于不维护关联关系, 没有外键的一方, 使用 @OneToOne 来进行映射, 建议设置 mappedBy=true
     */
    @OneToOne(mappedBy="mgr")
    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", mgrName='" + mgrName + '\''+
                '}';
    }
}
