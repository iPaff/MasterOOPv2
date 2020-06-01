package com.company;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String cola;
    private double deluxePrice = 25;

    public DeluxeBurger(String name, String meatType, String breadType) {
        super(name, meatType, breadType);
    }
    public void addCarrot(){
        System.out.println("Cannot add Carrot to Deluxe Burger");
    }
    public void addTomato(){
        System.out.println("Cannot add Tomato to Deluxe Burger");
    }
    public void addCucumber(){
        System.out.println("Cannot add Cucumber to Deluxe Burger");
    }

    public void totalPrice(){
        System.out.println("Your Total Price is " + deluxePrice);
    }
    public String getChips() {

        return chips;
    }

    public String getCola() {
        return cola;
    }

    public double getDeluxePrice() {

        return deluxePrice;
    }


}
