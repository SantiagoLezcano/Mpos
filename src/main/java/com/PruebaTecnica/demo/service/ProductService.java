package com.PruebaTecnica.demo.service;

import com.PruebaTecnica.demo.model.Product;
import java.util.List;

public interface ProductService {

    void saveProduct(Product product);

    void updateProduct(Product product);

    void desactivateProduct(Long id);

    List<Product> findAll();
}
