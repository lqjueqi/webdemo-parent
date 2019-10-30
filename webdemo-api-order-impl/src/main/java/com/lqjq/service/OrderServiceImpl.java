package com.lqjq.service;

import com.lqjq.mapper.OrderInfoMapper;
import com.lqjq.service.com.lqjq.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public OrderInfo queryOrderInfoById(Integer id) {

        return orderInfoMapper.selectOrderInfoById(id);
    }
}
