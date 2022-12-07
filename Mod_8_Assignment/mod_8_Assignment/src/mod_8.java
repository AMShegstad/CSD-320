/*
Alexander Shegstad
Mod 8 Assignment
11/29/2022

    Write a program with four methods for calculating the cost of a yearly auto service visit. The methods will be titled yearlyService.
        yearlyService(no parameters) - Will return the standard service charge.
        yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
        yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
        yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge,
        along with a coupon amount that will be deducted from the total cost.
        Write a main method that will test each of these methods two times.

 */
import java.util.Scanner;

public class mod_8 {

    public static void main(String[] args){

        // Testing the version with no parameters twice
        // I hardcoded the yearly service cost, so no change here
        System.out.println("Zero Parameters: Test 1:");
        yearlyService();
        System.out.println("Zero Parameters: Test 2:");
        yearlyService();

        // Testing the version with only one parameter twice
        // Gotta have that input!
        Scanner input = new Scanner(System.in);


        System.out.println("One Parameter: Test 1:");
        System.out.println("----------------------");
        System.out.println("How much for the oil change?");
        double a = input.nextDouble();
        yearlyService(a);


        System.out.println("One Parameter: Test 2:");
        System.out.println("----------------------");
        System.out.println("How much for the oil change?");
        double b = input.nextDouble();
        yearlyService(b);

        // Testing the version with two parameters twice
        System.out.println("Two Parameters: Test 1:");
        System.out.println("-----------------------");
        System.out.println("How much for an oil change?");
        double c = input.nextDouble();
        System.out.println("How much for the tire rotation?");
        double d = input.nextDouble();
        yearlyService(c,d);

        System.out.println("Two Parameters: Test 2:");
        System.out.println("-----------------------");
        System.out.println("How much for the oil change?");
        double e = input.nextDouble();
        System.out.println("How much for the tire rotation?");
        double f = input.nextDouble();
        yearlyService(e,f);

        System.out.println("Three Parameters: Test 1");
        System.out.println("------------------------");
        System.out.println("How much for the oil change?");
        double g = input.nextDouble();
        System.out.println("How much for the tire rotation?");
        double h = input.nextDouble();
        System.out.println("How much of a coupon do you have?");
        double i = input.nextDouble();
        yearlyService(g,h,i);

        System.out.println("Three Parameters: Test 2");
        System.out.println("------------------------");
        System.out.println("How much for the oil change?");
        double j = input.nextDouble();
        System.out.println("How much for the tire rotation?");
        double k = input.nextDouble();
        System.out.println("How much of a coupon do you have?");
        double l = input.nextDouble();
        yearlyService(j,k,l);

    }

    public static void yearlyService(){ // Zero Parameters

        double yearlyServiceCharge = 99.99;
        double combinedCost = yearlyServiceCharge;

        System.out.println("The cost for your yearly service is $" + yearlyServiceCharge);
    }

    public static void yearlyService(double oilChange){

        double yearlyServiceCharge = 99.99;
        double combinedCost = yearlyServiceCharge + oilChange;

        System.out.println("The cost for your yearly service plus an oil change is $" + combinedCost);
    }

    public static void yearlyService(double oilChange, double tireRotation){

        double yearlyServiceCharge = 99.99;
        double combinedCost = yearlyServiceCharge + oilChange + tireRotation;

        System.out.println("The cost for your yearly service, and oil change, and a tire rotation is $" + combinedCost);
    }

    public static void yearlyService(double oilChange, double tireRotation, double coupon){

        double yearlyServiceCharge = 99.99;
        double combinedCost = (yearlyServiceCharge + oilChange + tireRotation) - coupon;

        System.out.println("The cost for you yearly service, an oil change, a tire rotation, and your coupon is $" + combinedCost);
    }
}
