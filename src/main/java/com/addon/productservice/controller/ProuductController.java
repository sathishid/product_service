package com.addon.productservice.controller
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addon.productservice.entity.ProductEntity;
import com.addon.productservice.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/products")
public class ProuductController {

    @Autowired
    private ProductService productservice;

    @PostMapping()
    public ProductEntity save(@RequestBody ProductEntity productEntity) {
        return productservice.save(productEntity);
    }

    @GetMapping()
    public List<ProductEntity> get() {
        return productservice.get();
    }

    @GetMapping("/{prodId}")
    public ProductEntity getById(@PathVariable(name = "prodId") String productId) {
         Optional<ProductEntity> byProductId = productservice.findByProductId(productId);
         return byProductId.isPresent()?byProductId.get():null;
    }

    @PutMapping()
    public void update(@RequestBody ProductEntity productEntity) {
         productservice.update(productEntity);
    }

    @DeleteMapping("/{prodId}")
    public void delete(@PathVariable(name="prodId") String productId){
        productservice.deleteByProductId(productId);
    }

}
