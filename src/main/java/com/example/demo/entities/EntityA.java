package com.example.demo.entities;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
public class EntityA {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String name;
    
}
