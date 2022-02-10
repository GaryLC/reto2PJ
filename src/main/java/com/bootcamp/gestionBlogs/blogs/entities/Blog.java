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
    @ManyToOne()
    @JoinColumn(name = "autor_id")
    private Author autor;
    @ManyToOne()
    @JoinColumn(name = "post_id")
    private Post post;
    private String url;
    private Boolean status;
}
