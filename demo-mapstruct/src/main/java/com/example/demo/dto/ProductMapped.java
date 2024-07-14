package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductMapped {
    private Integer id;
    private String name;
    private Integer price;
    private String categoryObject;
    private String store;
}
