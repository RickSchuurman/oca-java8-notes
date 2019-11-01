package core_java_apis;

/*
 * String is a sequence of characters and Java counts from 0 when indexed
 *
 */

public class StringMethods {

    public static void main(String[] args) {

//        |a|n|i|m|a|l|s|
//        |0|1|2|3|4|5|6|

        {
            // length()
            String string = "animals";
            System.out.println(string.length()); // prints 7
        }

        {
            // charAt()
            String string = "animals";
            System.out.println(string.charAt(0)); // prints a
            System.out.println(string.charAt(6)); // prints s
//            System.out.println(string.charAt(7)); // throw exception nothing at index 7
        }

        {
            // indexOf()
            String string = "animals";
            System.out.println(string.indexOf("a")); // prints 0
            System.out.println(string.indexOf("al")); // prints 4
            System.out.println(string.indexOf('a', 3)); // prints 4, Java looks until it gets to index 3
            System.out.println(string.indexOf("al", 5)); // prints -1, no match found because it start looking after the match occurred
        }

        {
            // substring()
            String string = "animals";
            System.out.println(string.substring(3)); // prints mals, start at index 3 till the end
            System.out.println(string.indexOf("m")); // prints mals
            System.out.println(string.substring(3, 4)); // prints m , start at index 3 and stop (not including) index 4
            System.out.println(string.substring(3, 7)); // prints mals,  7 is the same as the end of the string (end of the string invisible position at 7 )
//            System.out.println(string.substring(3, 8)); // throw exception, no index 8
            System.out.println(string.substring(3, 3)); // empty String
//            System.out.println(string.substring(3, 2)); // throw exception, cant go back
        }

        {
            // toLowerCase(), toUpperCase()
            String string = "animals";
            System.out.println(string.toUpperCase()); // prints ANIMALS
            System.out.println("ABC123".toLowerCase()); // prints abc123
        }

        {
            // equals() equalIgnoreCase()
            System.out.println("abc".equals("ABC")); // prints false
            System.out.println("abc".equals("abc")); // prints true
            System.out.println("abc".equalsIgnoreCase("ABC")); // prints true
        }

        {
            // startsWith() endsWith()
            System.out.println("abc".startsWith("a")); // prints true
            System.out.println("abc".startsWith("c")); // prints false
            System.out.println("abc".startsWith("A")); // prints false
            System.out.println("abc".endsWith("A")); // prints false
        }

        {
            // contains()
            System.out.println("abc".contains("a")); // prints true
            System.out.println("abc".contains("A")); // prints false
        }

        {
            // replace()
            System.out.println("abcabc".replace("a", "A")); // prints AbcAbc
        }

        {
            // trim()
            System.out.println("a b c ".trim()); // prints a b c , only remove last space
            System.out.println("\t   a b c\n".trim()); // prints a b c remove tabs an newline
        }

        {
            // Method chaining String

            String a = "abc";
            String b = a.toUpperCase(); // ABC
            b = b.replace("B", "2"); // chaining String b
            System.out.println("a " + a); // prints abc
            System.out.println("b " + b); // prints A2C
        }

        {
            // Method chaining StringBuilder

            java.lang.StringBuilder a = new java.lang.StringBuilder("abc"); // new String builder opbject
            java.lang.StringBuilder b = a.append("de"); // there are two variables refferring to a which has value "abcde"
            b = b.append("f").append("g"); // two variables still reffering to object a which has value "abcdefg"
            System.out.println("a= " + a); //prints abcdefg
            System.out.println("b= " + b); //prints abcdefg

        }


    }
}
