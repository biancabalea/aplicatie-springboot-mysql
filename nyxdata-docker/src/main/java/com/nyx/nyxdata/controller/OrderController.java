package com.nyx.nyxdata.controller;

import com.nyx.nyxdata.entity.Order;
import com.nyx.nyxdata.repository.OrderRepository;
import com.nyx.nyxdata.service.OrderService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrder(Integer id) {
        return orderService.getOrder(id);
    }

    @PostMapping
    public Order createOrder(Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(Integer id, Order order) {

            return orderService.updateOrder(id, order);

    }

    @PatchMapping("/{id}")
    public Order updatePatchOrder(Integer id, Order order) {

            return orderService.updatePatchOrder(id, order);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteOrder(Integer id) {
        orderService.deleteOrder(id);
    }
}
