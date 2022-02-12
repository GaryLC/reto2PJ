package com.bootcamp.gestionBlogs.blogs.repositories;

import com.bootcamp.gestionBlogs.blogs.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(
            value = "select * from post c where c.datepost = CURRENT_DATE",
            nativeQuery = true)
    Post isPostfortoday();

}
