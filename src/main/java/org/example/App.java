package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        String cur = se.nextLine();
        int current = Integer.parseInt(cur);

        System.out.print("At what age would you like to retire? ");
        String ret = se.nextLine();
        int retire = Integer.parseInt(ret);

        int dif = retire - current;

        int newY = year + dif;

        System.out.println("You have " + dif + " years left until you can retire.\nIt's " + year + ", so you can retire in " + newY + ".");


    }
}
