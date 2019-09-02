package operators_and_statements.statements;

public class IfThenStatement {

    public static void main(String[] args) {
        {
            int count = 1;
            if (count < 11)
                System.out.println(count + " is smaller than 11"); // Curly braces not required for single statement
        }


        {
            int count = 1;
            if (count < 11) {
                ++count;
                System.out.println(count + " is smaller than 11"); // Curly braces for multiple statements
            }
        }

        // Will be executed even if condition is false. Curly braces missing
        {
            int count = 12;
            if (count < 11)
                ++count; // will not be executed single statement if
            ++count; // will be executed because there are no braces
            System.out.println(count + " is bigger than 11 without braces"); // prints 12
        }


        // Will not be executed, condition is false
        {
            int count = 12;
            if (count < 11) {
                ++count;
                System.out.println(count + " is bigger than 11");
            }
        }
    }
}
