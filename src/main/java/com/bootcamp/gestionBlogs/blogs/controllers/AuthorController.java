package com.bootcamp.gestionBlogs.blogs.controllers;


import com.bootcamp.gestionBlogs.blogs.entities.Author;
import com.bootcamp.gestionBlogs.blogs.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

//    DoctorController(DoctorService doctorService){
//        this.doctorService= doctorService;
//    }

    @GetMapping
    public List<Author> findAll(){
        System.out.println("call findALl");
        return this.authorService.findAll();
    }


    @PostMapping
    public Author save(@RequestBody Author author){
        return this.authorService.save(author);
    }

}
