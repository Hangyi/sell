package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ZhuHangYi
 * @create 2020-05-17 03:42
 */


public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {  //主键是Integer类型的

    /**
     * 查商品的类目肯定是想一次性查的,而不是分很多次, 而且我们是通过categoryType来查的
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
