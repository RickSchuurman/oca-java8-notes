/*
 * + indicates that a number is positive
 * - indicates literal number is negative
 * ++ increments value by 1
 * -- decrements value by 1
 * ! inverts a boolean logical value
 */

package operators_and_statements.unary_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        {
            boolean x = false;
            System.out.println(x); // prints false
            x = !x;
            System.out.println(x); // prints true
        }

        {
            double x = 1.21;
            System.out.println(x); // prints 1.21
            x = -x;
            System.out.println(x); // prints -1.21
            x = -x;
            System.out.println(x); // prints 1.21
        }

        {
//            int x = !5; // DOES NOT COMPILE
//            boolean y = !true;  // DOES NOT COMPILE
        }

        {
            int counter = 0;
            System.out.println(counter); // 0
            System.out.println(++counter); // 1
            System.out.println(counter); // 1
            System.out.println(counter--); // 1
            System.out.println(counter); // 0
        }

        {
            int x = 3;
            int y = ++x * 5 / x-- + --x;
            System.out.println(x);
            System.out.println(y);

            //  int y = 4 * 5 / 4 + 2;


        }
    }
}
