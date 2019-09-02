/*
 * Data types supported by switch statements include the following"
 * - byte, Byte
 * - short, Short
 * - char, Character
 * - int, Integer
 * - String
 * - enum values
 *
 * Data types NOT supported boolean, long
 *
 *
 * The value in each case statement must be compile constant values of the same data type as the switch value
 *
 */

package operators_and_statements.statements;

public class SwitchStatement {

    public static void main(String[] args) {


        // switch statement may contain 0 or more case brances

        int dayOfTheWeek = 0;
        switch (dayOfTheWeek) {
            default: // optional, may be appear anywhere in the switch statement
                System.out.println("weekday");
                break; // optional, termintate switch statement and return flow control
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
