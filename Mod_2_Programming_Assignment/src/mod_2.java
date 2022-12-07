/*
Alexander Shegstad
10/10/2022
Module 2 Programming Assignment

Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperature of the water.

 */

// Allows me to create Scanner objects, which allows me to receive input from the user.
import java.util.Scanner;

public class mod_2 {

    static public void main(String[] args) {
        // Initialize the scanner object to save user input.
        Scanner input = new Scanner(System.in);

        // Use the scanner to request input, and then assign the value to the correct variable: waterMass
        System.out.println("Please enter the mass of the water (in Kilograms): \n");
        double waterMass = input.nextDouble();

        // Use the scanner to request input, and then assign the value to the correct variable: initialTemp
        System.out.println("Please enter the initial temperature of the water (in Celsius): \n");
        double initialTemp = input.nextDouble();

        // Use the scanner to request input, and the assign the value to the correct variable: finalTemp
        System.out.println("Please enter the final temperature of the water (in Celsius): \n");
        double finalTemp = input.nextDouble();

        // Input the formula that was given at the onset:
        double q = waterMass * (finalTemp - initialTemp) * 4184;

        // Format the results in an easily readable format.
        System.out.println("It will take " + q + " joules to heat " + waterMass + " of water from " + initialTemp);
        System.out.println("degrees Celcius to " + finalTemp + " degrees Celcius.");
    }
}
