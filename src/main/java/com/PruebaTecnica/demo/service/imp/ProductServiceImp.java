package com.PruebaTecnica.demo.service.imp;

import com.PruebaTecnica.demo.model.Product;
import com.PruebaTecnica.demo.repository.ProductRepository;
import com.PruebaTecnica.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }


    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void desactivateProduct(Long id) {
        Optional<Product> product= productRepository.findById(id);
        if(product.isPresent()) {
            product.get().setStatus(false);
        }else {
            log.warn("Producto no encontrado");
        }

    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
