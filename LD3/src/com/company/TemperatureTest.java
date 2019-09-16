/*
 * File: TemperatureTest.java
 * Author: Java, Java, Java
 * Description:  An application program to test the Temperature class.
 */
package com.company;

import java.io.*;                  // Import the Java I/O classes
import java.text.NumberFormat;   // For formatting as $nn.dd or n%

public class TemperatureTest             
{
    /**
     *   main() reads temperatures from the keyboard and creates an instance
     *    of the Temperature class to convert from Celsius to Fahrenheit and
     *    vice versa.
     */
    public static void main(String argv[]) throws IOException
    {
        BufferedReader input = new BufferedReader    // Handles console input
            (new InputStreamReader(System.in));
        String inputString;                          // inputString stores the input
     
        Temperature temperature = new Temperature(); // Create a Temperature object
        double tempIn, tempResult;
        // Numuri
        NumberFormat myFormat = NumberFormat.getIntegerInstance();
        myFormat.setMaximumFractionDigits(1);
        myFormat.setMinimumFractionDigits(1);
        System.out.println("This program will convert Fahrenheit to Celsius and vice versa.");

                     // Convert Fahrenheit to Celsius

        System.out.print("Input a temperature in Fahrenheit > ");   // Prompt for Celsius
        inputString = input.readLine();                             // Get user input
        tempIn = Double.parseDouble(inputString);                   // Convert to double
        tempResult = temperature.fahrToCels(tempIn);                // Convert to Celsius
        System.out.println(tempIn + " F = " + myFormat.format(tempResult) + " C ");  // Report the result

                     // Convert Celsius to Fahrenheit

        System.out.print("Input a temperature in Celsius > ");      // Prompt for Celsius
        inputString = input.readLine();                             // Get user input
        tempIn = Double.parseDouble(inputString);                   // Convert to double
        tempResult = temperature.celsToFahr(tempIn);                // Convert to Fahrenheit
        System.out.println(tempIn + " C = " + myFormat.format(tempResult) + " F ");  // Report the result
    } // main()
} // TemperatureTest
