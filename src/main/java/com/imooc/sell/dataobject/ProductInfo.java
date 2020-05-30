package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * @author ZhuHangYi
 * @create 2020-05-30 00:05
 */

@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId; //这里不需要自增注解, 因为这是随机产生的字符

    //名字
    private String productName;

    //单价
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //小图
    private String productIcon;

    //状态, 0正常, 1下架
    private Integer productStatus;

    //类目编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
