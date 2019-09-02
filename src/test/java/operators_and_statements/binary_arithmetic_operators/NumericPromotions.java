/*
*
* Numeric Promotion Rules
* - If two values have different data types, Java will automatically promote one of the values to the larger of the two data types
* - If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point values data type
* - Smaller data types, namely byte, short and char are first promoted to int any time they used with a binary arithmetic operator
* - Resulting value has same type as the promoted operands
*
 */


package operators_and_statements.binary_arithmetic_operators;

public class NumericPromotions {

    public static void main(String[] args) {
        {
            int x = 1;  // long is larger then int, promoted to long
            long y = 33;

            long sum = x * y;
        }

        {

            double x = 39.21;
            float y = 2.1f; // double is larger then float, promoted to double

            double sum = x + y;

        }

        {
            int x = 14; //
            double z = 30.31;

            double sum = x / z;
        }


        {
            short x = 10; // smaller data types promoted to int
            short y = 3;

            int sum = x / y;
        }

        {
            short x = 14; // promoted to int, then promoted to float so it can divided by y. The result x * y will promoted to double
            float y = 13;
            double z = 30;

            double sum = x * y / z;
        }


    }

}
