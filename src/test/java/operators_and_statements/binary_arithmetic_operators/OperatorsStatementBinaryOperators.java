/*
*
* Three types of operators: unary, binary, ternary, depending to how many operands they can be applied (1, 2, or 3)
* 1 + 2 = 3 // 1 and 3 are operands and + is a operator
*
* Order of operator precedence (most weird ones are not required for this Exam):

| Operator                           | Symbols and examples
| Post-unary operators               | expression++, expression--
| Pre-unary operators                | ++expression, --expression
| Other unary operators              | ~, +, -, !

| Multiplication/Division/Modules    | *, /, %
| Addition/Subtraction               | +, -
| Shift operators                    | <<. >>, >>>
| Relation operators                 | <, >, <=, >=, instanceof
| Equal to/not equal to              | ==, !=
| Logical operators                  | &, ^, |
| Short circuit logical operators    | &&, ||
| Ternary operators                  | boolean expression ? expression1 : expression2
| Assignment operators               | =, +=, -=, *=

*
*
*
* Arithmetic Operators may be applied to any Java primitives, except boolean an String
* addition + subtraction - multiplication, * division, / modules %
*
* addition +, += may be applied to String values, which result in String concatenation
*

*/

package operators_and_statements.binary_arithmetic_operators;

public class OperatorsStatementBinaryOperators {

    public static void main(String[] args) {
        {

            // multiplecative operators (*, /, %) have a higher order of precedence than the additive operators (+, -)
            int x = 2 * 5 + 3 * 4 - 8;

            // first evaluatie 2 * 5 and 3 * 4. Remaining terms in left to right
            int xx = 10 + 12 - 8;
        }

        {
            // changing order of operation with parentheses
            int y = 2  * ((5 + 3) * 4 - 8);


            int yy = 2 * (8 * 4 - 8);

            int yyy = 2 * (32 - 8);

            int yyyy = 2 * 24;

        }

        {

            System.out.println(9 / 3); // Outputs 3
            System.out.println(9 % 3); // Outputs 0

            System.out.println(10 / 3); // Outputs 3 results in floor value
            System.out.println(10 % 3); // Outputs 1

            System.out.println(11 / 3); // Outputs 3
            System.out.println(11 % 3); // Outputs 2

            System.out.println(12 / 3); // Outputs 4
            System.out.println(12 % 3); // Outputs 0

        }

    }
}
