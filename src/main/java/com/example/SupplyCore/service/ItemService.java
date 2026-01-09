package com.example.SupplyCore.service;

import com.example.SupplyCore.entity.Item;
import com.example.SupplyCore.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepo;
    private final InventoryService inventoryService;

    public Page<Item> findAll(Pageable pageable) {
        return itemRepo.findAll(pageable);
    }

    public int stock(Long itemId) {
        return inventoryService.getRemainingStock(itemId);
    }
}