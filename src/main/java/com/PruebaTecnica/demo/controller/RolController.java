//package com.PruebaTecnica.demo.controller;
//
//import com.PruebaTecnica.demo.model.Rol;
//import com.PruebaTecnica.demo.service.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/rol")
//public class RolController {
//
//    @Autowired
//    private RolService rolService;
//
//    @PostMapping
//    void save(@RequestBody Rol rol){
//        rolService.saveRol(rol);
//    }
//
//    @PutMapping
//    void update(@RequestBody Rol rol){
//        rolService.saveRol(rol);
//    }
//
//    @GetMapping
//    List<Rol> findAll(){
//        return rolService.finAll();
//    }
//
//    @PutMapping("/{id}")
//    void desactivated(@PathVariable long id){
//        rolService.desactivateRol(id);
//    }
//}
