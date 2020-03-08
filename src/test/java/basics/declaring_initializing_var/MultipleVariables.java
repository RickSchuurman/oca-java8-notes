package basics.declaring_initializing_var;

public class MultipleVariables {

    public static void main(String[] args) {
        String s1, s2; // two variables declared
        String s3 = "yes", s4 = "no"; // two variables declared and initialized

        int i1, i2, i3 = 1; // three variables declared and 1 initialized


//        int num, String value // DOES NOT COMPILE, declare multipe types of different values in one statement is not allowed

        boolean b1, b2; // Declare two variables without initializing
        String s5 = "1", s6; // Declared two variables and one initialized
//      double d1, double d2; // You should share the declaration and not repeat
//      int i6; int i7; // Each one is a separate statement (;)
//      int i8; i9; // Two statements and one is not declared

    }
}
