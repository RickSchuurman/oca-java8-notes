package core_java_apis;

public class Equality {

    public static void main(String[] args) {


        // == comporator is object equality, whether a reference points to the same object

        {
            java.lang.StringBuilder one = new java.lang.StringBuilder();
            java.lang.StringBuilder two = new java.lang.StringBuilder();
            java.lang.StringBuilder three = one.append("a");
            System.out.println(one == two); // false // two seperate StringBuilders
            System.out.println(one == three); // true // one and three both point to the same object

        }

        {
            // Strings are immutabel and literals are pooled. The JVM created only one literal in memory. X an Y point to the same location in memory

            String x = "Hello World";
            String y = "Hello World";
            System.out.println(x == y); // true

        }

        {
            String x = "Hello World";
            String z = "Hello World".trim(); // X an Z points no to the same location in memory z is a new object
            System.out.println(x == z); // false

        }

        {
            String a = new String("Hello World");
            String b = "Hello world";
            System.out.println(a == b); // false

        }

            // equals is logical comparator, it checks the value inside the String rather than the String itself
        {
            String x = "Hello World";
            String y = "Hello World".trim();
            System.out.println(x.equals(y)); // true

        }
    }
}
