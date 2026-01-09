package com.example.SupplyCore.service;

import com.example.SupplyCore.entity.Order;
import com.example.SupplyCore.exception.InsufficientStockException;
import com.example.SupplyCore.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepo;
    private final InventoryService inventoryService;

    public Order save(Order order) {
        int stock = inventoryService.getRemainingStock(order.getItem().getId());
        if (order.getQty() > stock) {
            throw new InsufficientStockException("Insufficient stock");
        }
        return orderRepo.save(order);
    }
}