package com.example.demo;

import com.example.demo.dto.Product;
import com.example.demo.dto.ProductMapped;
import com.example.demo.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class MapStructController {

    private  final ProductMapper productMapper;
    @GetMapping
    ResponseEntity<ProductMapped> getProducr(){
        Product productToBeMapped = new Product(1, "iPhone", 55,"Phones");
        var productMapped = productMapper.mapToDomain(productToBeMapped);
        return ResponseEntity.ok(productMapped);
    }
    @PutMapping
    ResponseEntity<ProductMapped> putProducrExtention(@RequestBody Product product){
        Product productToBeMapped = new Product(1, "iPhone", 55,"Phones");
        var productMapped = productMapper.mapToDomain(productToBeMapped);
        return ResponseEntity.ok(productMapped);
    }
    @PutMapping
    ResponseEntity<ProductMapped> putProducr(@RequestBody Product product){
        Product productToBeMapped = new Product(1, "iPhone", 55,"Phones");
        var productMapped = productMapper.mapToDomain(productToBeMapped);
        return ResponseEntity.ok(productMapped);
    }

}
