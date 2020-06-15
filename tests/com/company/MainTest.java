package com.company;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void printMenu() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main main = new Main();
        main.printMenu();
        String expectedOutput = "*---------------------Menu---------------------*\n" +
                "Enter the name of the item you would like to view\n" +
                "Burgers\n" +
                "Milkshakes\n" +
                "Extras\n" +
                "Desserts\n" +
                "Meal Deals\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}


