package org.example.Seminar6.hw.Nb;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Model {
    private Integer id;
    private String fabricator;
    private Integer ram;
    private Integer hd;
    private Integer price;

    public String toString() {
        return "Notebook" + id + ": {" +
                "ID = " + id +
                ", Производитель: '" + fabricator + '\'' +
                ", Размер RAM = " + ram +
                ", Размер HD = " + hd +
                ", Цена = " + price +
                "}";
    }
}
