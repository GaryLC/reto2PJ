package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Blog;
import com.bootcamp.gestionBlogs.blogs.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public String saveBlog(Blog blog) {
        if (blog.getStatus().equals("activo")) {
            if (3 <= getCountAuthor(blog)) {
                return "Un autor puede tener máximo 03 blogs";
            }
            blogRepository.save(blog);
            return "Registro con exito";
        }else {
            return "Solo se puede registrar  blog  en estado activo";
        }
    }

    private Long getCountAuthor(Blog blog) {
        return blogRepository.countAuthor(blog.getAuthor().getId());
    }
}
