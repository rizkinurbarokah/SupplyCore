package com.example.SupplyCore.service;

import com.example.SupplyCore.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepo;
    private final OrderRepository orderRepo;

    public int getRemainingStock(Long itemId) {
        return inventoryRepo.totalStock(itemId)
                - orderRepo.totalOrdered(itemId);
    }
}