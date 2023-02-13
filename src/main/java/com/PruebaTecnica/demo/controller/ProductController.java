//package com.PruebaTecnica.demo.controller;
//
//import com.PruebaTecnica.demo.model.Product;
//import com.PruebaTecnica.demo.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/product")
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @PostMapping("/add")
//    void save(@RequestBody Product product){
//        productService.saveProduct(product);
//    }
//
//    @PutMapping("/update")
//    void update(@RequestBody Product product){
//        productService.saveProduct(product);
//    }
//
//    @GetMapping("/findall")
//    List<Product> findAll(){
//        return productService.finAll();
//    }
//
//    @PutMapping("(/desactivated/{id}")
//    void desactivated(@PathVariable long id){
//        productService.desactivateProduct(id);
//    }
//
//}