package com.bootcamp.gestionBlogs.blogs.entities;


import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String descripcion;
    @ManyToOne()
    @JoinColumn(name = "author_id")
    private Author author;
    @ManyToOne()
    @JoinColumn(name = "post_id")
    private Post post;
    private String url;
    private String status;
}
