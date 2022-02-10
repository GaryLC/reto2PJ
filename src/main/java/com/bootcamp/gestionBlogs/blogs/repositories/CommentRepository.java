package com.bootcamp.gestionBlogs.blogs.repositories;

import com.bootcamp.gestionBlogs.blogs.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Long> {
}
