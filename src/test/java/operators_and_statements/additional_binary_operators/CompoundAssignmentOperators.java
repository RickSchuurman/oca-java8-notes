/*
 * Compound operators helps with cast a value
 *
 * Only += and -+ for the exam
 *
 */

package operators_and_statements.additional_binary_operators;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        {
            int x = 2, z = 3;
            x = x * z; // result 6 // simple assignment operator
            System.out.println(x);
        }

        {
            int x = 2, z = 3;
            x *= z; // result 6  // compound operator
            System.out.println(x);
        }

        {
//            int z = 3;
//            x *= z; // NOT COMPILE, x is not defined
        }

        {
//            long x = 10;
//            int y = 5; // RESULT promoted to long
//            y = y  * x; // DOES NOT COMPILE y is a integer and should be cast to long

            long x = 10;
            int y = 5;
            y = (int) (y * x);
            System.out.println(y);

            // OR

            long xx = 10;
            int yy = 5;
            yy *= x;

            System.out.println(y);
        }

        {
            long x = 5;
            long y = (x = 3); // first sets value x to 3 , second returns the value
            System.out.println(x); // prints 3
            System.out.println(y ); // prints 3
        }


    }
}
