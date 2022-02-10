package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Author;

import java.util.List;

public interface AuthorService {
     List<Author> findAll();

     Author save(Author doctor);

}
