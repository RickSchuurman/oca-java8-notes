package operators_and_statements.statements;

public class IfThenElse {

    public static void main(String[] args) {
        {
            int hourOfDay = 10;
            if (hourOfDay < 11) {
                System.out.println("Good morning");
            } else {
                System.out.println("Good evening");
            }
        }

        {
            int hourOfDay = 19;
            if (hourOfDay < 11) {
                System.out.println("Good morning");
            } else if (hourOfDay < 20) {
                System.out.println("Good afternoon");
            } else {
                System.out.println("Good evening");
            }
        }

//        {
//         int x = 1;
//         if(x) {} // DOES NOT COMPILE, not boolean expression
//        }

//        {
//            int x = 1;
//            if (x = 1) {} // DOES NOT COMPILE, not a assign operator
//        }

    }
}
