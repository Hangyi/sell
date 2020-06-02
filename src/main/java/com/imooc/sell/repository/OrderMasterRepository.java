package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ZhuHangYi
 * @create 2020-05-30 18:29
 */

public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    //想一下有哪些查询方法
    //按照买家的id来查, 并且会有一个分页
    //如果不加pageable这个参数的话,那把一个人所有的订单都查出来了
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
