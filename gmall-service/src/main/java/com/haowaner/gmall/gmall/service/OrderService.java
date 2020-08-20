package com.haowaner.gmall.gmall.service;

import com.haowaner.gmall.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
