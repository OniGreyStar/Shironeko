package shiro.neko.model;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(nullable = false,unique = true)
    private String title;

    @Column(nullable = false)
    private String author;
}
