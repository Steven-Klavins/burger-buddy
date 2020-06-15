package com.company;

import java.lang.reflect.Array;
import java.lang.reflect.Member;

public class Main {
    public static String [] MENU = new String[] {"Burgers", "Milkshakes", "Extras", "Desserts", "Meal Deals"};

    public static void main(String[] args) {
        printMenu();

    }

    public static void printMenu(){
        System.out.println("*---------------------Menu---------------------*");
        System.out.println("Enter the name of the item you would like to view");
        for (int i = 0; i< MENU.length; i++) {
            System.out.print(MENU[i]+"\n");
        };

    };

}
