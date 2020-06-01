package com.company;

public class Hamburger {
    private String name;
    private String meatType;
    private String breadType;

    private boolean carrot;
    private double carrotPrice = 0.3;

    private boolean cucumber;
    private double cucumberPrice = 0.5;

    private boolean tomato;
    private double tomatoPrice = 0.4;

    private double currentHamburgerPrice;

    public Hamburger(String name, String meatType, String breadType) {
        this.name = name;
        this.meatType = meatType;
        this.breadType = breadType;
    }




    public void addCarrot(boolean carrot){
        this.carrot = carrot;
    }
    public void addCucumber(boolean cucumber){
        this.cucumber = cucumber;
    }
    public void addTomato(boolean tomato){
        this.tomato = tomato;
    }


    public void totalPrice() {
        double baseHamburgerPrice = 10;
        currentHamburgerPrice = baseHamburgerPrice;
        System.out.println("Hamburger Base Price is " + baseHamburgerPrice);
        if (carrot == true) {
            System.out.println("Carrot added to Hamburger, addition cost " + carrotPrice);
            System.out.println(currentHamburgerPrice + carrotPrice);
        }
        if (cucumber == true) {
            System.out.println("Cucumber added to Hamburger, addition cost " + cucumberPrice);
            System.out.println(currentHamburgerPrice +carrotPrice + cucumberPrice);
        }
        if (tomato == true) {
            System.out.println("Tomato added to Hamburger, addition cost " + tomatoPrice);
            System.out.println("Total Hamburger Price " + (currentHamburgerPrice + carrotPrice + cucumberPrice + tomatoPrice));
        } else {
            System.out.println(baseHamburgerPrice);
        }
    }
}
