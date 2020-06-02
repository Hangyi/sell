package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ZhuHangYi
 * @create 2020-05-30 18:33
 */


public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);

}
