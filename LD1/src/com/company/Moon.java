package com.company;
import java.util.Scanner;  // Import the Scanner class


public class Moon {
    public static void main(String args[]) {
        double moonweight; // weight on moon

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter weight");

        float myWeight = myObj.nextFloat();  // Read user input


        moonweight = myWeight * 0.17;

        System.out.println(myWeight + " earth-kilos is equivalent to " +
                moonweight + " moon-kilos.");

    }
}