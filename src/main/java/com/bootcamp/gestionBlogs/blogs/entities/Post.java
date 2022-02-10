package com.bootcamp.gestionBlogs.blogs.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(unique = true , nullable = false)
    private Long id;
    private String title;
    private Date date;
    private String status;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
