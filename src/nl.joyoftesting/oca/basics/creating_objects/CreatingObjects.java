/*
 *
 * Object is an instance of a class
 *
 * Constructor which is a special type of method that creates new objects
 *
 */

package basics.creating_objects;

import java.util.Random;

public class CreatingObjects {

    public static void main(String[] args) {

        // Declare the type that you'll be creating (Random)
        // Give the variable a name (r), this gives Java a place to store a reference to the object
        // Create a new object (new Random)
        // Random() looks like a method since it is followed by parentheses. It's called a constructor which is a special type of method that creates new objects
        Random r = new Random();
        Chick c = new Chick();

        System.out.println(r.nextInt(100));
    }
}


/*
 *
 * The name of the constructor match the name of the class and is upperCase
 * A constructor has no return type
 *
 */

class Chick {

    //    public void Chick() {} // NOT a constructor because there is a return type
    public Chick() {
        System.out.println("In constructor");
    }
}


/*
 *
 * The purpose of a constructor is to initialize fields (gives variable a value)
 *
 * For most classes, you don't have to code a constructor, the compiler will supply a "do nothing" default constructor for you.
 *
 */

class Chicken {
    int numEggs = 0; // initialize on line
    String name;

    public Chicken() {
        name = "Duke"; // initialize in constructor

    }
}