/*
 * Ternary operator also known as condition operator. Takes three operands and is of the form booleanExpression ? expression : expression
 *
 *
 */

package operators_and_statements.statements;

public class TernaryOperator {

    {
        int y = 10;
        int x;
        if (y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
    }

//     OR

    {
        int y = 10;
        int x = (y > 5) ? (x = 2 * y) : (x = 3 * y);


    }

    {
        int y = 10;
        System.out.println((y < 5) ? 21 : "Zebra");
//        int animal = ((y < 5) ? 21 : "Zebra"); // NOT COMPILE, expect a INT as return type
    }
}
