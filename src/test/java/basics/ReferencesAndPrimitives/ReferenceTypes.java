/*
 *
 * A reference type refers to an object (an instance of a class)
 * Unlike value types, a reference type doesn't store its value directly. Instead, it stores the address where the value is being stored. In other words, a reference type contains a pointer to another memory location that holds the data.
 *
 *
 */

package basics.ReferencesAndPrimitives;

public class ReferenceTypes {

    public static void main(String[] args) {

        java.util.Date today; // declare a reference type of type java.util.Date. Point to a date object
        String greeting; // declare a reference type of type String. Point to a String object

    // A value is assigned to a reference in one of the two ways
    // 1. A reference can be assigned to another object of the same type
    // 2. A reference can be assigned to a new object using the new keyword

        today = new java.util.Date();
        greeting = "Hello world";

        System.out.println(today);
        System.out.println(greeting);
    }
}
