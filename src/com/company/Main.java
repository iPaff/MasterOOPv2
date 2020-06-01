package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Hamburger","Beef", "Brown");
        hamburger.addTomato(true);
        hamburger.addCucumber(true);
        hamburger.addCarrot(true);
        hamburger.totalPrice();

        System.out.println("*****************************");

        HealthyBurger healthyBurger = new HealthyBurger("HealtyBurger","Pork","brown");
        healthyBurger.addCheese(false);
        healthyBurger.addAvocado(true);
        healthyBurger.totalPrice();

        System.out.println("*****************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger","Chicken","White");
        deluxeBurger.addCucumber();
        deluxeBurger.addCarrot();
        deluxeBurger.totalPrice();
    }
}
