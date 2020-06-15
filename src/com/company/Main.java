package com.company;

import java.lang.reflect.Array;
import java.lang.reflect.Member;

public class Main {
    public static String [] MENU = new String[] {"#1 Burgers", "#2 Milkshakes", "#3 Extras", "#4 Desserts", "#5 Meal Deals"};
    public double total = 0.00;
    public static void main(String[] args) {
        printMenu();

    }

    public static void printMenu(){
        System.out.println("*---------------------Menu---------------------*");
        System.out.println("Select an item");
        for (int i = 0; i< MENU.length; i++) {
            System.out.print(MENU[i]+"\n");
        };

    };

    public static void user () {
        boolean finished = false;
        while (finished == false){

        }

    }



}
