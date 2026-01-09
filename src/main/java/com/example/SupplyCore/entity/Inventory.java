package com.example.SupplyCore.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "inventory")
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @NotNull
    @Min(1)
    private Integer qty;

    @NotBlank
    @Pattern(regexp = "T|W", message = "Type must be T or W")
    private String type;
}
