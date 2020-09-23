package core_java_apis;

/*
 * Rules:
 * If both operands are numeric, + means numeric addition
 * If either operand is a String,  + means concatenation
 * The expression is evaluated left to right
 */

public class Concatenation {

    public static void main(String[] args) {
        {
            System.out.println(1 + 2); // prints 3
            System.out.println("a" + "b"); // prints ab
            System.out.println("a" + "b" + 3); // prints ab3
            System.out.println(1 + 2 + "c"); // prints 3c
        }

        {
            int three = 3;
            String four = "4";
            System.out.println(1 + 2 + three + four); // prints 64
        }

        {
            String s = "1";
            s += 2;
            s += "3";
            System.out.println(s); // prints 123
        }

        {
            /*
             * Once a String object is created it is  not allowed to change it. Called Immutable
             */

            String s1 = "1";
            String s2 = s1.concat("2");
            s2.concat("3"); // s2 is immutable, you need to create a new String
            System.out.println(s2); // prints 12
        }

        {
            String a = "abc";
            String b = a.toUpperCase();
            b = b.replace("B", "2").replace("C", "3"); // chain method
            System.out.println("a=" + a); // returns abc
            System.out.println("b=" + b); // returns a23, without assign it wil return ABC

        }
    }
}
