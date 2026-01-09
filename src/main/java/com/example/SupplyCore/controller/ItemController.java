package com.example.SupplyCore.controller;

import com.example.SupplyCore.entity.Item;
import com.example.SupplyCore.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemController {

//    private final ItemService service;
//
//    @GetMapping
//    public Page<Item> list(Pageable pageable) {
//        return service.findAll(pageable);
//    }
    @GetMapping
    public String test() {
        return "OK";
    }
}
