package com.bootcamp.gestionBlogs.blogs.repositories;

import com.bootcamp.gestionBlogs.blogs.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {



    @Query(value = "SELECT count(id) FROM blog where author_id = :author_id", nativeQuery = true)
     Long countAuthor(@Param("author_id") Long authorid);

}
