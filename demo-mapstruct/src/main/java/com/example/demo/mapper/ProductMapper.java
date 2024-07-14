package com.example.demo.mapper;

import com.example.demo.dto.Product;
import com.example.demo.dto.ProductMapped;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface ProductMapper {
    @Mapping(target = "categoryObject", source = "category")
    @Mapping(target = "store", constant = "Fnac")
    ProductMapped mapToDomain(Product product);
}
