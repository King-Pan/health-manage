package com.javalearn.health.manage.constant;

/**
 * @author king-pan
 * @date 2019-12-12 14:11
 * 关系
 */
public enum RelationShipEnum {
    SPOUSE(1, "配偶"),
    PARENTS(2, "父母"),
    CHILD(3, "子女"),
    RELATIVE(4,"亲戚"),
    FRIEND(5,"朋友"),
    OTHER(6,"其他");

    private final int value;
    private final String description;

    private RelationShipEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }
}
