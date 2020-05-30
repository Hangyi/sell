package com.imooc.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author ZhuHangYi
 * @create 2020-05-30 10:17
 */

@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code , String message) {
        this.code = code;
        this.message = message;
    }

}
