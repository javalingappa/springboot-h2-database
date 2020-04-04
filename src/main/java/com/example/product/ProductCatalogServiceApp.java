package com.example.product;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * product_catalog_service!
 * @author Javalingappa
 */

@Log
@SpringBootApplication
public class ProductCatalogServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogServiceApp.class, args);
    }
}
