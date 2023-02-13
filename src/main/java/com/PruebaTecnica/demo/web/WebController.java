package com.PruebaTecnica.demo.web;

import com.PruebaTecnica.demo.repository.ProductRepository;
import com.PruebaTecnica.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class WebController {

    @Autowired
    private ProductService productService;

    @GetMapping("/index")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        Object products = productService.findAll();
        log.info("ejecutando el controlador Spring MVC");
        log.info("usuario que hizo login:" + user);
        model.addAttribute("productos", products);
        return "index";
    }
}
