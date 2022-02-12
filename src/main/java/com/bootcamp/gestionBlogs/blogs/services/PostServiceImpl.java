package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Post;
import com.bootcamp.gestionBlogs.blogs.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return this.postRepository.findAll();
    }

    @Override
    public String save(Post post) {
        var postExistfortoday = postRepository.isPostfortoday();
        if (postExistfortoday != null) {
            return "Solo puedes registrar un post por día ";
        } else if (post.getStatus().equals("publicado")) {

            post.setDatePost(LocalDate.now());
            this.postRepository.save(post);
            return "post registrado ";
        } else {
            return "Solo se debe registrar comentarios a post en estado publicado ";
        }

    }
}

