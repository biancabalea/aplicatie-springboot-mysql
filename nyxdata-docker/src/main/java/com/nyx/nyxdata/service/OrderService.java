package com.nyx.nyxdata.service;

import com.nyx.nyxdata.entity.Order;
import com.nyx.nyxdata.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrder(@PathVariable("id") Integer id) {
        return orderRepository.findById(id).get();
    }

    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(@PathVariable("id") Integer id, @RequestBody Order order) {
        Order existingOrder = orderRepository.findById(id).get();
        if (existingOrder != null) {
            existingOrder.setQuantity(order.getQuantity());
            existingOrder.setStatus(order.getStatus());
            existingOrder.setOrderNumber(order.getOrderNumber());
            existingOrder.setUser(order.getUser());
            existingOrder.setAddress(order.getAddress());
            existingOrder.setProduct(order.getProduct());
            // Add other fields as needed
            return orderRepository.save(existingOrder);
        }
        return null;
    }

    public Order updatePatchOrder(@PathVariable("id") Integer id, @RequestBody Order order) {
        Order existingOrder = orderRepository.findById(id).get();
        if (existingOrder != null) {
            if (order.getQuantity() != null) {
                existingOrder.setQuantity(order.getQuantity());
            }
            if (order.getStatus() != null) {
                existingOrder.setStatus(order.getStatus());
            }
            if (order.getOrderNumber() != null) {
                existingOrder.setOrderNumber(order.getOrderNumber());
            }
            if (order.getUser() != null) {
                existingOrder.setUser(order.getUser());
            }
            if (order.getAddress() != null) {
                existingOrder.setAddress(order.getAddress());
            }
            if (order.getProduct() != null) {
                existingOrder.setProduct(order.getProduct());
            }
            return orderRepository.save(existingOrder);
        }
        return null;
    }
    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }
}
