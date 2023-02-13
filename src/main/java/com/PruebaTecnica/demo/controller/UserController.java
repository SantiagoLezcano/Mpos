//package com.PruebaTecnica.demo.controller;
//
//
//import com.PruebaTecnica.demo.model.User;
//import com.PruebaTecnica.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping
//    void save(@RequestBody User user){
//        userService.saveUser(user);
//    }
//
//    @PutMapping
//    void update(@RequestBody User user){
//        userService.saveUser(user);
//    }
//
//    @GetMapping
//    List<User> findAll(){
//        return userService.finAll();
//    }
//
//    @PutMapping("/{id}")
//    void desactivated(@PathVariable long id){
//        userService.desactivateUser(id);
//    }
//}
