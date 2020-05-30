package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ZhuHangYi
 * @create 2020-05-30 00:13
 */


public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    //需要编写什么方法呢,想不到的话,可以接着往下开发,等需要的时候再回过头来开发
    //一个查漏补缺的过程
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
