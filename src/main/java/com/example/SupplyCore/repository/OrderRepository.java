package com.example.SupplyCore.repository;

import com.example.SupplyCore.entity.Order;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, String> {

    @Query("""
    SELECT COALESCE(SUM(o.qty),0)
    FROM Order o
    WHERE o.item.id = :itemId
    """)
    Integer totalOrdered(@Param("itemId") Long itemId);
}