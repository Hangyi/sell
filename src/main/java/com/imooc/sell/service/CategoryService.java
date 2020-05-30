package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * @author ZhuHangYi
 * @create 2020-05-17 13:18
 */

public interface CategoryService {

    //第一个,第二个是给后台管理用的,买家端是用不到的
    //查询一条记录
    ProductCategory findOne(Integer categoryId);

    //查询所有
    List<ProductCategory> finAll();

    //买家端用到的是这个
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //新增和更新都是save方法
    ProductCategory save(ProductCategory productCategory);

}
