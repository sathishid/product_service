package com.addon.productservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "AL_TR_PRODUCT")
public class ProductEntity {
    @Id
    @SequenceGenerator(name = "PROD_SEQ", sequenceName = "AL_PRODUCT_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROD_SEQ")
    private Long id;
    @Column(name = "pr_id")
    private String productId;
    @Column(name = "pr_name")
    private String productName;
    @Column(name = "pr_price")
    private Double price;
}
