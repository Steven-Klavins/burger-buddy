package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static String[] MENU = new String[]{"#1 Burgers", "#2 Milkshakes", "#3 Extras", "#4 Desserts", "#5 Meal Deals", "#6 Exit"};
    public static String[] BURGERS = new String[]{"#1 Cheese burger - £7.00", "#2 Beef burger - £5.00","#3 Chicken burger - £7.00", "#4 Veggie burger - £5.00"};
    public static double total = 0.00;
    public static List<String> items = new ArrayList<>();

    public static void main(String[] args) {
        user();

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

        while (finished==false) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                   burgers();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    finished = true;
                    break;
                default:
                    System.out.println("Please enter a valid selection");
            }
        }
    }

    public static void burgers () {
        System.out.println("*--------------------Burgers--------------------*");
        System.out.println("Select a burger");
        for (int i = 0; i < BURGERS.length; i++) {
            System.out.print(BURGERS[i] + "\n");
        };
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt()-1;

        if(choice == 0 || choice == 2){
            total += 7.00;
            items.add(BURGERS[choice]);
        }
        else {
            total += 5.00;
            items.add(BURGERS[choice]);
        }
        printOrder ();
        printMenu();

    }

    public static void printOrder () {
        System.out.println("*---------------------order---------------------*");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + "\n");
        };
        String result = String.format("%.2f", total);
        System.out.println("Total: " + result);
    }
}
