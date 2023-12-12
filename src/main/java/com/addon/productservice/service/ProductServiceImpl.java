package com.addon.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addon.productservice.dao.ProductRepository;
import com.addon.productservice.entity.ProductEntity;

import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional
    public ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public List<ProductEntity> get() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findByProductId(String productId) {
         Optional<ProductEntity> first = productRepository.findByProductId(productId).stream().findFirst();
         return first;
    }
    
    @Override
    @Transactional
    public ProductEntity update(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    @Transactional
    public void deleteByProductId(String productId) {
         productRepository.deleteByProductId(productId);
    }


}
