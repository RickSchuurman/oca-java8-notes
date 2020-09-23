/*
 *
 * Relational operators compares two expressions and return a boolean value
 * < less than
 * <= less than or equal to
 * > greater than
 * >= greater than or equal to
 *
 */

package operators_and_statements.additional_binary_operators;

public class RelationalOperators {

    public static void main(String[] args) {
        int x = 10, y = 20, z = 10;
        System.out.println(x < y); // true
        System.out.println(x <= y); // true
        System.out.println(x > z); // false
        System.out.println(x >= z); // true
    }
}
