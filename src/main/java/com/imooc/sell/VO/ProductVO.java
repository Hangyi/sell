package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * @author ZhuHangYi
 * @create 2020-05-30 14:50
 */

@Data
public class ProductVO {

    @JsonProperty("name") //但是前端需要这个叫name,所以用这个注解
    private String categoryName; //起名字具体点

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
