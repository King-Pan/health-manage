package com.javalearn.health.manage.common;

import lombok.Data;

import java.util.List;

/**
 * @author king-pan
 * @date 2019/11/12 15:27
 */
@Data
public class BootstrapMessage<T>  implements Message {
    private List<T> rows;
    private Integer start;
    private Integer limit;
    private Long total;
}
