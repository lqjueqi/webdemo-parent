package com.lqjq.mapper;

import com.lqjq.service.com.lqjq.entity.OrderInfo;

public interface OrderInfoMapper {

    //@Select("select * from db_order_info where id={#id}")
    OrderInfo selectOrderInfoById(Integer id);
}
