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
                "Select an item\n" +
                "#1 Burgers\n" +
                "#2 Milkshakes\n" +
                "#3 Extras\n" +
                "#4 Desserts\n" +
                "#5 Meal Deals\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}


