package org.example.diplomademo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "cashback")
public class Cashback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "value")
    private Integer value;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    private Card card;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "sale_point_id")
    private SalePoint salePoint;

    public Cashback() { }

    public Cashback(int value, Card card, SalePoint salePoint) {
        this.value = value;
        this.card = card;
        this.salePoint = salePoint;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cashback cashback = (Cashback) o;
        return id == cashback.id && value.equals(cashback.value) && card.equals(cashback.card) && salePoint.equals(cashback.salePoint);
    }

    @Override
    public int hashCode() { return Objects.hash(id, value, card, salePoint); }

    @Override
    public String toString() {
        return "Cashback{" +
                "id=" + id +
                ", value=" + value +
                ", card=" + card +
                ", salePoint=" + salePoint +
                '}';
    }
}
