package com.bootcamp.gestionBlogs.blogs.repositories;

import com.bootcamp.gestionBlogs.blogs.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


}
