package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @author ZhuHangYi
 * @create 2020-05-30 10:10
 */


public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    //管理端,直接查询所有
    Page<ProductInfo> findAll(Pageable pageable); //分页

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
