package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Comment;
import com.bootcamp.gestionBlogs.blogs.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public String saveComent(Comment comment) {
        commentRepository.save(comment);
        return "Registrado Correctamente";
    }
}
