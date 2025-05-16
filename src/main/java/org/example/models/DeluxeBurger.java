package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private  String drink="Coke";

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }
    public DeluxeBurger() {
        super(19.10);
        this.cips = "CURVY";
        this.drink = "COKE";

    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("1Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition2(String addition1Name, double addition1Price) {
        System.out.println("2Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition3(String addition1Name, double addition1Price) {
        System.out.println("3Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition4(String addition1Name, double addition1Price) {
        System.out.println("4Deluxe Burger için yeni malzeme eklenemez.");
    }
}
