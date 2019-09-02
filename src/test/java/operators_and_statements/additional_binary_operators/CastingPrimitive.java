/*
 *
 * Casting primitive values, from a larger to a smaller numerical data type
 *
 */

package operators_and_statements.additional_binary_operators;

public class CastingPrimitive {

    public static void main(String[] args) {
        {

//    int x = 1.0; // NOT COMPILE, assign a double to an integer
            int x = (int) 1.0; // Cast double value to a int, prints 1
            System.out.println(x);

//    short y 1921222 // DOES NOT COMPILE, outside the range of short
            short y = (short) 1921222; // Cast int to short, prints 20678 (overflow, number is to large and will not fit)
            System.out.println(y);

//    int z = 9f; DOES NOT COMPILE, float into int
            int z = (int) 9f; // Cast float to int, prints 9
            System.out.println(z);

//    long t = 192301398193810323; DOES NOT COMPILE; interprets as int needs L at the end
            long t = 192301398193810323L;
        }
        {
            short x = 10;
            short y = 3;
//            short z = x * y; // DOES NOT COMPILE, shorts are promoted to int, resulting value should also be int
            short z = (short) (x * y);
            System.out.println(z);
        }
    }
}
