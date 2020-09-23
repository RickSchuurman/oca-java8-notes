/*
 * Logical operators &, |, ^  both sides will always be validate
 *
 * Conditional operators &&, || the right hand side will never be validated if the final result can be determined by the left hand side
 *
 *
 */

package operators_and_statements.additional_binary_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        {
            boolean x = true || (3 < 4); // right side will never be validated since x = alway true
        }

//        {
//            if (x != null && x.getValue() < 5) {
//              // if x was null then x.getValue will never be reached
//            }
//        }

        {
//            if (x != null & x.getValue() < 5) // x.getValue will be executed
        }

        {
            int x = 6;
            boolean y = (x >= 6) || (++x <=7); // right side will not be exectuted since left side is true
            System.out.println(x); // prints 6
        }
    }
}
