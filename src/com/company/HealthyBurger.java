package com.company;

public class HealthyBurger extends Hamburger {
    private boolean cheese;
    private double cheesePrice = 1.5;

    private boolean avocado;
    private double avocadoPrice = 2.5;
    private double currentHealthyBurgerPrice;




    public HealthyBurger(String name, String meatType, String breadType) {
        super(name, meatType, breadType);

    }

    public void addCheese(boolean cheese){
        this.cheese = cheese;
    }
    public void addAvocado(boolean avocado){
        this.avocado = avocado;
    }


    public void totalPrice(){
        double healthBurgerPrice = 15;
        currentHealthyBurgerPrice = healthBurgerPrice;
        System.out.println("HealthyBurger Base Price is " + healthBurgerPrice);
        if (cheese == true){
            System.out.println("Cheese added to Healthy Hamburger, addition cost " + cheesePrice);
            System.out.println(currentHealthyBurgerPrice + cheesePrice);
        }
        if (avocado == true){
            System.out.println("Avocado added to Healthy Hamburger, addition cost " + cheesePrice);
            System.out.println(currentHealthyBurgerPrice + cheesePrice + avocadoPrice);
        }
          System.out.println("Your Total Price is " + (currentHealthyBurgerPrice + cheesePrice + avocadoPrice));

    }

}
