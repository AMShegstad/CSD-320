/*
Alexander Shegstad
CSD320-345A Programming With Java
11/10/2022

Mod 5 Assignment
    Write a program that uses a while loop to display the following math operations both in the smaller to larger order
    and then the larger to smaller order with the denominator being 3 through 99.  Ensure your application displays the
    mathematical results.
        1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
        1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
 */

public class mod_5 {

    public static void main(String[] args){

        // Declare the variables that I will be relying on for my loops.
        double up = 3.0;
        double down = 99;
        double i = 0.0;
        double j = 0.0;

        // Start the upward counting while-loop.
        while (up <= 100.0){

            // This will print every fraction that I will be adding.
            System.out.println("1 / " + up + " + ");
            i = i + (1 / up);
            // incrementing upwards 2 at a time.
            up += 2;

            // Once the goals are met, we will print the sum of all numbers.
            if(up > 99) {
                System.out.println(i);

                // Starting the downward counting loop...
                while(down >= 2){

                    // Displaying all of the same fractions, but moving towards zero.
                    System.out.println("1 / " + down + " + ");
                    j = j + (1 / down);
                    // Incrementing downward 2 at a time.
                    down -= 2;

                    //Display sum after all fractions are listed.
                    if(down < 3){
                        System.out.println(j);

                    }
                }

            }

        }

    }

}