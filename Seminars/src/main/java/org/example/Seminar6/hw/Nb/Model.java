package org.example.Seminar6.hw.Nb;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Model {
    private Integer id;
    private String fabricator;
    private Integer size_ram;
    private String type_hd;
    private Integer size_hd;
    private Integer price;

    public String toString() {
        return "\nNotebook" + id + ": {" +
                "ID = " + id +
                ", Производитель: '" + fabricator + '\'' +
                ", Размер RAM = " + size_ram +
                ", Тип HD: '" + type_hd + '\'' +
                ", Размер HD = " + size_hd +
                ", Цена = " + price +
                "}";
    }
}
