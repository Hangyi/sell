package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @author ZhuHangYi
 * @create 2020-05-30 18:18
 */

@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINSHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
