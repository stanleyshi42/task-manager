package com.example.task_manager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String text;

}
