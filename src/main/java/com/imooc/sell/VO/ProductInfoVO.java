package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.swing.*;
import java.math.BigDecimal;

/**
 * 商品详情
 * @author ZhuHangYi
 * @create 2020-05-30 14:55
 *  为什么不直接用ProductInfo对象呢?
 *  因为这里前端需要的只是一部分, 前端需要多少个字段,我们就返回多少个,为了安全
 */

@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
