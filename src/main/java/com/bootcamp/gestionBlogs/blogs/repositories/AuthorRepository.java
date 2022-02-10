package com.bootcamp.gestionBlogs.blogs.repositories;

import com.bootcamp.gestionBlogs.blogs.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
