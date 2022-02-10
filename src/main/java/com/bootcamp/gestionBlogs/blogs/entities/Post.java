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
    @ManyToOne()
    @JoinColumn(name = "comment_id")
    private  Comment comment;

}
