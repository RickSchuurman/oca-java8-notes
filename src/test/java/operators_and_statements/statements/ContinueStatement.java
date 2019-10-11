package operators_and_statements.statements;

public class ContinueStatement {

    public static void main(String[] args) {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            System.out.println("outer loop " + a);
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                System.out.println("Inner loop " + x);
//                System.out.println(" " + a + x);
            }
        }
    }
}


// look at table 2.5 page 91 which contrl statements can accept break and continue statements