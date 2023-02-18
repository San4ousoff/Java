package org.example.Seminar3.hw.hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer sort;

}
