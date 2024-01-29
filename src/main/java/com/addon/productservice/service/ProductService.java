package com.addon.productservice.service;

import java.util.List;
import java.util.Optional;

import com.addon.productservice.entity.ProductEntity;

public interface ProductService {

    ProductEntity save(ProductEntity productEntity);
    List<ProductEntity> get();
    Optional<ProductEntity> findByProductId(String productId);
    ProductEntity update(ProductEntity productEntity);
    void deleteByProductId(String productId);
    
}
