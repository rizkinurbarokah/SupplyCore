package com.example.SupplyCore.repository;

import com.example.SupplyCore.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
