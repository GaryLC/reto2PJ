package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Post;
import com.bootcamp.gestionBlogs.blogs.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if (post.getStatus().equals("publicado")) {
            postRepository.save(post);
            return "succes con comentario ,post en estado publicado";
        } else {
            post.setStatus("borrador");
            post.setComment(null);
            postRepository.save(post);
            return "succes sin comentario";
        }
    }
}
