public class mod_1 {
    /*
    Alexander Shegstad
    10/19/2022
    Module 1 Programming Assignment

    The following code is intended to show how performing maths with int vs float
    can result in very different answers, stating a need for thoughtful selection of
    data types.
     */

    static public void main(String[] args) {
        // Because we are using a formula with decimal places, we cast to float
        float formula_1 = (float) (4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ));

        // There are all ints, so of course, int!
        int formula_2 = 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );


        // The below print statement will result in "3.2837384"
        System.out.println(formula_1);

        // The below print statement will result in "4"
        System.out.println(formula_2);

        /*

        Performing mathematical functions with integers can still result in floating point results, so if the equation you
        are using does anything other than add and subtract, I'd suggest casting to float. If accuracy is important to
        your program, and I cannot see any reason it would not be, then float should be the preferred type. Of course, there
        are other number types that can be used, but sticking with int when the results may not be ints could be detrimental.

         */


    }
}
