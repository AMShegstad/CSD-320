/*
Alexander Shegstad
CSD320-345A Programming with Java
11/11/2022

Write a program that uses nested for loops to output the following with the shown display format:
                   1               @
                 1 2 1             @
               1 2 4 2 1           @
             1 2 4 8 4 2 1         @
          1 2 4 8 16 8 4 2 1       @
       1 2 4 8 16 32 16 8 4 2 1    @
    1 2 4 8 16 32 64 32 16 8 4 2 1 @

 
*/
public class mod_6 {
    public static void main(String[] args) {

        int rows = 5;

        // Setting up the overall for-loop
        for (int i = 0; i <= rows; i++) {
            // The number to iterate and print
            int number = 1;
            for (int j = i; j <= rows; j++) {

                System.out.print("   ");
            }

            // print numbers after spaces
            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, number) + "  ");
                number++;
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(number-- + "  ");
            }

            for (int j = i; j <= rows; j++) {

                System.out.print("   ");
            }

            System.out.print("@");
            // new line
            System.out.println();
        }
    }
}