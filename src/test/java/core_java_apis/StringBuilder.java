package core_java_apis;


/*
 * Because the String object is immutable, a new String object is assigned when String object is used again
 *
 * The StringBuilder class creates a String without storing new objects
 * StringBuilder is not immutable
 *
 */

public class StringBuilder {

    public static void main(String[] args) {

        java.lang.StringBuilder str = new java.lang.StringBuilder("tutorials ");
        System.out.println("string = " + str); // prints string = tutorials

        // appends the string argument to the StringBuilder
        str.append("point");

        // print the StringBuilder after appending
        System.out.println("After append = " + str); // prints After append = tutorials point

        str = new java.lang.StringBuilder("1234 ");
        System.out.println("string = " + str); // prints string 1234

        // appends the string argument to the StringBuilder
        str.append("!#$%");

        // print the StringBuilder after appending
        System.out.println("After append = " + str); // prints After append 1234 !#$%


        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
            System.out.println(alpha); // prints a, ab, abc, abcd etc.... each time the old object becomes eligible for garbage collector
            // after 26 iterations through the loop, a total of 27 objects are instantiated.
        }


        java.lang.StringBuilder delta = new java.lang.StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            delta.append(current); // this code reuse the same StringBuilder without creating an interim String each time
            System.out.println(delta); // prints a, ab, abc, abcd etc....
        }

        java.lang.StringBuilder sb1 = new java.lang.StringBuilder();  // empty sequence of characters and assign sb1 to point to it
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("annimal"); // specific value and assign sb2 to point to it
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(10); // how many slots for character should be reserve
    }

}


