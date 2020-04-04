package com.example.product.repository;

import com.example.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Javalingappa
 */

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
