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
 * If you leave out the break statement, flow will continue to the next proceeding case or default block automaticaly
 *
 * There is no require that the case or default statements be in a particular order
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


        // Results in Weekday  and Saturday
        // Jumps direct to default and execute all of the proceeding case statements in order until it finds a break statement
        int dayOfTheWeek2 = 5;
        switch (dayOfTheWeek2) {
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("weekday");
            case 6:
                System.out.println("Saturday");
        }
    }

    private int getSortOrder(String firstname, final String lastname) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstname) {
            case "Test": // compiles, String literal
                return 52; // return statement act like a break
//            case middleName: // Not compile because it is not a final variable
//                id = 5;
//                break;
            case suffix: // compiles, suffix is a final variable
                id = 0;
                break;
//            case lastname: // Not compile because it is not a constant
//                id = 8;
//                break;
//            case 5: // Not compile because no matching type of String (INT)
//                id = 9;
//                break;
//            case 'J': // Not compile because no matching type of String (CHAR)
//                id = 10;
//                break;
//            case java.time.DayOfWeek: // Not compile because no matching type of String (ENUM)
//                id = 15;
//                break;
        }
        return id;
    }


}




