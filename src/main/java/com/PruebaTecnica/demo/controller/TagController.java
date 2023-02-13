//package com.PruebaTecnica.demo.controller;
//
//
//import com.PruebaTecnica.demo.model.Tag;
//import com.PruebaTecnica.demo.service.TagService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/tag")
//public class TagController {
//
//    @Autowired
//    private TagService tagService;
//
//    @PostMapping
//    void save(@RequestBody Tag tag){
//        tagService.saveTag(tag);
//    }
//
//    @PutMapping
//    void update(@RequestBody Tag tag){
//        tagService.saveTag(tag);
//    }
//
//    @GetMapping
//    List<Tag> findAll(){
//        return tagService.finAll();
//    }
//
//    @PutMapping("/{id}")
//    void desactivated(@PathVariable long id){
//        tagService.desactivateTag(id);
//    }
//
//}
