/*
 * equal operator ==
 * not equals operator !=
 *
 * Comparing two numeric primitive types, if they not the same type they will promoted 5 = 5.00 returns true (5 promoted to a double).
 * Comparing two boolean values
 * Comparing two objects, including null and String values
 *
 */

package operators_and_statements.additional_binary_operators;

import java.io.File;

public class EqualityOperators {

    // boolean x = true == 3 // DOES NOT COMPILE
    // boolean y = false != "Giraffe" // DOES NOT COMPILE

    public static void main(String[] args) {
        File x = new File("myFile.txt");
        File y = new File("myFile.txt");
        File z = x;
        System.out.println(x == y); // prints false, two different objects
        System.out.println(x == z); // prints true, the point to the same object
    }

}
