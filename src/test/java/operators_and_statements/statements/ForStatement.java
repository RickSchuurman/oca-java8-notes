package operators_and_statements.statements;


/*
 * Sequence
 * - Initialization statement executes
 * - If booleanExpression is true continue, else exit loop
 * - Body executes
 * - Execute update statement
 * - return to boolean Expression
 *
 * Variables in declared in initialization block have limited scope, only accessible within the for loop
 *
 *
 */

public class ForStatement {

    public static void main(String[] args) {
        forLoop();
//        infiniteLoop();
        multipleTermsForLoop();
        fixRedeclaringVariabele();
        commaBetweenNames();
        comparingMultipleElements();
//        doubleAssign();
        test();
    }

    public static void forLoop() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " ");
        }
    }

//    public static void infiniteLoop() {
//        for (; ; ) { // components of the for loop are optional semicolons are required. So for(;){} will not compile
//            System.out.println("Hello World");
//        }
//    }

    public static void multipleTermsForLoop() {
        int x = 0; // declare variable for loops begins and use it after it completes
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) { // can include extra variables that may not reference each other, z is defined in initialization but never used
            System.out.println(y + " "); // prints y 0,1,2,3,4
        }
    }

//    // Will not compile x, duplicate variable declaration. Already declared before the loop
//    public static void RedeclaringVariabele() {
//        int x = 0;
//        for (long y = 0, x = 1; x < 5 && y < 10; x++, y++) { // x declared as LONG
//            System.out.println("NOT COMPILE");
//        }
//    }

    // now it works because variable is be assigned in initialization block and not declared
    public static void fixRedeclaringVariabele() {
        int x = 0;
        long y = 10;
        for (x = 0, y = 1; x < 5 && y < 10; x++, y++) {
            System.out.println("NOT COMPILE");
        }
    }
//
//    public static void incompatibleDataTypes() {
//        for (long y = 0, int x = 4; x < 5 && y < 10; x++, y++) {  // The variables of initialization block must all be of the same type
//            System.out.println("Not compile");
//        }
//    }


//    public static void usingVariableOutsideLoop(){
//        for (long x = 0, y = 1; x < 5 && y < 10; x++, y++) {
//            System.out.println("NOT COMPILE");
//        }
//        System.out.println(x); // outside of scope
//    }

    public static void commaBetweenNames() {
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (i > 0) {
                System.out.println(", ");
            }
            System.out.println(name);
        }
    }

    public static void comparingMultipleElements() {
        int[] values = new int[3];
        values[0] = 10;
        values[1] = new Integer(5);
        values[2] = 15;
        for (int i = 1; i < values.length; i++) {
            System.out.println((values[i] - values[i - 1])+ " ");
        }
    }

//    public static void doubleAssign() {
//        for (int x = 0; x < 10; ) { //
//            x = x++; // assign x to the old value 0  loop will not end
//            System.out.println(x);
//            System.out.println("Hello world");
//
//        }
//    }

    public static void test(){
        int i;
        int j;
        for(i = 0, j = 0; j < i; ++j, i++)
        {
            System.out.println("test a" + i + j);
        }
        System.out.println("test b" + i + j);
    }

}
