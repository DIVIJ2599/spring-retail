package com.retail.service;

import java.time.LocalDate;
import java.util.List;

import com.retail.exception.CustomerNotFoundException;
import com.retail.exception.LoginException;
import com.retail.exception.OrderException;
import com.retail.models.Customer;
import com.retail.models.Order;
import com.retail.models.OrderDTO;

public interface OrderService {
    public Order saveOrder(OrderDTO odto,String token) throws LoginException, OrderException;

    public Order getOrderByOrderId(Integer OrderId) throws OrderException;

    public List<Order> getAllOrders() throws OrderException;

    public Order cancelOrderByOrderId(Integer OrderId,String token) throws OrderException;

    public Order updateOrderByOrder(OrderDTO order,Integer OrderId,String token) throws OrderException,LoginException;

    public List<Order> getAllOrdersByDate(LocalDate date) throws OrderException;

    public Customer getCustomerByOrderid(Integer orderId) throws OrderException;


}
