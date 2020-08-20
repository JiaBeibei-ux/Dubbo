package com.haowaner.gmall;

import com.haowaner.gmall.gmall.bean.UserAddress;
import com.haowaner.gmall.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);
        List<UserAddress> addresses = orderService.initOrder("1");
        for (UserAddress address : addresses) {
            System.out.println(address);
        }

        System.in.read();
    }
}
