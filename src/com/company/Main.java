package com.company;

import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static String [] MENU = new String[] {"#1 Burgers", "#2 Milkshakes", "#3 Extras", "#4 Desserts", "#5 Meal Deals", "#6 Exit"};

    public static void main(String[] args) {
        double total = 0.00;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        user();

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
        printMenu();
        while (!finished){

        }

    }



}
