package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Author;
import com.bootcamp.gestionBlogs.blogs.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }


    @Override
    public Author save(Author doctor) {
        return this.authorRepository.save(doctor);
    }

}
