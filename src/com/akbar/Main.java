package com.akbar;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.44,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",2.55);
        hamburger.addHamburgerAddition2("Lettuce",0.66);
        hamburger.addHamburgerAddition3("Potato",0.66);
        System.out.println("Total Burger price is "+ hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.69);
        healthyBurger.addHamburgerAddition1("Egg",5.33);
        healthyBurger.addMealAddition1("Lentils",3.45);
        System.out.println("Total Healthy Burger price is "+healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Should not do this ",44.4);
        deluxeBurger.itemizeHamburger();
    }
}
