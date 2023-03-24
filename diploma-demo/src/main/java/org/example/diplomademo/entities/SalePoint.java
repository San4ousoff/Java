package org.example.diplomademo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sale_point")
public class SalePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;

    public SalePoint() { }

    public SalePoint(String name) { this.name = name; }

    public SalePoint(long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "SalePoint{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
