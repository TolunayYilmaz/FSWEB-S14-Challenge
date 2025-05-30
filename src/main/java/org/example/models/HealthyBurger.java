package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price,String meat) {

        super(name, "Tofu", price, "breadRollType");
    }
    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    System.out.println(healthyExtra1Name+" "+healthyExtra1Price);
    }
    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
        System.out.println(healthyExtra2Name+" "+healthyExtra2Price);
    }
    @Override
    public String itemizeHamburger(){
        setPrice(getPrice()+healthyExtra1Price+healthyExtra2Price);
       return "HealthyHamburger "+healthyExtra1Name+" "+healthyExtra2Name+" "+(healthyExtra1Price+healthyExtra2Price);
    }
}
