package com.addon.productservice.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addon.productservice.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long>
{
    List<ProductEntity> findByPrice(Double price);
    Optional<ProductEntity> findById(Long id);
    List<ProductEntity> findByProductId(String productId);
    List<ProductEntity> findAll();
    void deleteByProductId(String productId);
}
