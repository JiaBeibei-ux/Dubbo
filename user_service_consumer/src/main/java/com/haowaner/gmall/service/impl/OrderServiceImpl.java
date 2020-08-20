package com.haowaner.gmall.service.impl;

import com.haowaner.gmall.gmall.bean.UserAddress;
import com.haowaner.gmall.gmall.service.OrderService;
import com.haowaner.gmall.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 将服务提供者注册到注册中心
 * 让服务消费者取注册二中心去订阅服务
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println(userId);
        //需要查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress);
        }
        return addressList;
    }
}
