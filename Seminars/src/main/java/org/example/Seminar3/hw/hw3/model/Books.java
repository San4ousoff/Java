package org.example.Seminar3.hw.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {
    private String title;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer pages;
}
