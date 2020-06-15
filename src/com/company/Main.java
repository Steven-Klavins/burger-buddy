package com.company;

import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static String[] MENU = new String[]{"#1 Burgers", "#2 Milkshakes", "#3 Extras", "#4 Desserts", "#5 Meal Deals", "#6 Exit"};
    public static String[] BURGERS = new String[]{"#1 Cheese burger - £7.00", "#2 Beef burger","#3 Chicken burger - £7.00", "#4 Veggie burger"};
    public static void main(String[] args) {
        user();
        double total = 0.00;
    }

    public static void printMenu() {
        System.out.println("*---------------------Menu---------------------*");
        System.out.println("Select an item");
        for (int i = 0; i < MENU.length; i++) {
            System.out.print(MENU[i] + "\n");
        };
    };

    public static void user() {
        boolean finished = false;
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (finished==false) {

            switch (choice) {
                case 1:
                   burgers();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter a valid selection");
            }
            finished = true;
        }
    }

    public static void burgers () {
        System.out.println("*--------------------Burgers--------------------*");
        System.out.println("Select a burger");
        for (int i = 0; i < BURGERS.length; i++) {
            System.out.print(BURGERS[i] + "\n");
        };

    }
}
