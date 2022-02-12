package com.bootcamp.gestionBlogs.blogs.controllers;


import com.bootcamp.gestionBlogs.blogs.entities.Author;
import com.bootcamp.gestionBlogs.blogs.entities.Blog;
import com.bootcamp.gestionBlogs.blogs.entities.Comment;
import com.bootcamp.gestionBlogs.blogs.entities.Post;
import com.bootcamp.gestionBlogs.blogs.services.AuthorService;
import com.bootcamp.gestionBlogs.blogs.services.BlogService;
import com.bootcamp.gestionBlogs.blogs.services.CommentService;
import com.bootcamp.gestionBlogs.blogs.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestionBlogs")
public class GestionBlogsController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/listBlogs")
    public List<Blog> findAllBlog() {
        return this.blogService.findAll();
    }

    @PostMapping("/save/blog")
    public String saveBlog(@RequestBody Blog blog) {
        return this.blogService.saveBlog(blog);
    }

    @GetMapping("/listAuthor")
    public List<Author> findAll() {
        return this.authorService.findAll();
    }

    @PostMapping("/save/post")
    public String savePost(@RequestBody Post post) {
        return this.postService.save(post);
    }

    @PostMapping("/save/comment")
    public String saveComment(@RequestBody Comment comment) {
        return this.commentService.saveComent(comment);
    }

    @GetMapping("/listPost")
    public List<Post> findAllPost() {
        return this.postService.findAll();
    }

    @PostMapping
    public Author save(@RequestBody Author author) {
        return this.authorService.save(author);
    }
}

