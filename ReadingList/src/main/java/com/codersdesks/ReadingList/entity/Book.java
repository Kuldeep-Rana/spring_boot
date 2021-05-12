package com.codersdesks.ReadingList.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
