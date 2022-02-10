package com.bootcamp.gestionBlogs.blogs.entities;


import javax.persistence.*;
import java.util.Date;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "datecomment")
    private Date dateComment;
    private String nombre ;
    private String estado ;
}
