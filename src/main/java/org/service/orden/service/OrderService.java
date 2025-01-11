package org.service.orden.service;

import org.service.orden.exception.OrderNotFoundException;
import org.service.orden.model.Order;
import org.service.orden.repository.OrderRepository;
import org.service.orden.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> getAllOrders(){
        return repository.findAll();
    }

    public Optional<Order> getOrderById(String id) {
        Order order = repository.findById(id).orElse(null);
        if(order == null){
            throw new OrderNotFoundException(id);
        }
        return Optional.ofNullable(order);
    }

    public Order createOrder(OrderRequest request) {
        Order order = new Order();
        order.setCustomerName(request.getCustomerName());
        order.setProduct(request.getProduct());
        order.setQuantity(request.getQuantity());
        order.setOrderDate(request.getOrderDate());
        return repository.save(order);
    }

    public void deleteOrder(String id) {
        repository.deleteById(id);
    }
}
