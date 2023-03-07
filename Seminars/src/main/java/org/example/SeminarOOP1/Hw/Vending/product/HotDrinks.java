package org.example.SeminarOOP1.Hw.Vending.product;

public class HotDrinks extends Product{
    private int temperature;

    public HotDrinks(String name, Integer price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {return temperature;}

    @Override
    public String toString() {return super.toString() + ", temperature=" + temperature;}

}
