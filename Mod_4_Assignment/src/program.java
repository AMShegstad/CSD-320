/*
Alexander Shegstad
CSD320-345A Programming With Java
Mod 4 Assignment

Assignment:
Write a program that prompts a user to enter two strings and then checks the strings entered and reports if either the
first string is a substring of the second string, or if the second string is a substring of the first string.
 */

// Importing the Scanner utility for input.
import java.util.Scanner;

public class program {
    public static void main(String[] args){

        // Creating the Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the first string, called input1
        System.out.println("Please enter a String: ");
        String input1 = input.nextLine();

        // Prompting the user to enter the second string, called input2
        System.out.println("Please enter another String: ");
        String input2 = input.nextLine();

        // Is input2 a part of input1? Print the index just to be sure.
        if(input1.contains(input2)){
            System.out.println("Your first String, \'" + input1 + "\' does contain your second String, \'" + input2 + "\'");
            System.out.println(input1.indexOf(input2));
            System.out.println();
        }
        else {
            System.out.println("Your first String, \'" + input1 + "\' does not contain your second String, \'" + input2 + "\'");
            System.out.println(input1.indexOf(input2));
            System.out.println();
        }

        // Is input1 a part of input2? Print the index just to be sure.
        if(input2.contains(input1)){
            System.out.println("Your second String, \'" + input2 + "\' does contain your first String, \'" + input1 + "\'");
            System.out.println(input2.indexOf(input1));
            System.out.println();
        }
        else {
            System.out.println("Your second String, \'" + input2 + "\' does not contain your first String, \'" + input1 + "\'");
            System.out.println(input2.indexOf(input1));
            System.out.println();
        }


    }
}
