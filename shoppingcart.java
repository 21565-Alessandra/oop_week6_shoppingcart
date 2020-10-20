package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    double apple = 0.60;
    double orange = 0.25;
    int total_apple;
    int total_orange;
    double total;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Insert how many apples did you get");
        total_apple = keyboard.nextInt();

        System.out.println("Insert how many oranges did you get");
        total_orange = keyboard.nextInt();

        System.out.println("The total for the apples you got is: " + total_apple * apple);
        System.out.println("The total for the oranges you got is: " + total_orange * orange);

        total = (total_apple * apple + (total_orange * orange));

        System.out.println("You have to pay: " + total);

    }
}
