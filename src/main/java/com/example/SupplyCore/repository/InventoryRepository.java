package com.example.SupplyCore.repository;

import com.example.SupplyCore.entity.Inventory;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    @Query("""
    SELECT COALESCE(SUM(
        CASE 
            WHEN i.type = 'T' THEN i.qty
            WHEN i.type = 'W' THEN -i.qty
        END
    ),0)
    FROM Inventory i
    WHERE i.item.id = :itemId
    """)
    Integer totalStock(@Param("itemId") Long itemId);
}