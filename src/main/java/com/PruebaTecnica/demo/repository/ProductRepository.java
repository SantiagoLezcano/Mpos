package com.PruebaTecnica.demo.repository;

import com.PruebaTecnica.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
