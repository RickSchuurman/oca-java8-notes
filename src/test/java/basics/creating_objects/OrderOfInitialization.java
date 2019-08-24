/*
 *
 * Fields and instance initializer are run in the order in which the appear in the file
 *
 * The constructor runs after all fields and instance initializer blocks have run
 *
 */

// 1. Starts with main method because this is were Java starts execution
// 2. Java creates new object orderOfInitialization
// 3. Initializes name to Fluffy
// 4. Execute print statement "setting field" in the instance initializer
// 5. Once all the fields and instance initializer have run Java returns the constructor
// 6. Change the value of name to Tiny
// 7. Execute print statement "setting constructor"
// 8. Execute print statement in the main method

package basics.creating_objects;

public class OrderOfInitialization {

    private String name = "Fluffy";   // instance variable

    // instance initializer
    {
        System.out.println("setting field");
    }

    public OrderOfInitialization() { // constructor
        name = "Tini";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        OrderOfInitialization orderOfInitialization = new OrderOfInitialization(); // create new object
        System.out.println(orderOfInitialization.name);
    }
}

//class OtherMatters {
//    {
//        System.out.println(name); // DOES not compile because you can not refer to a variable before it has been initialized
//        private String name = "Fluffy";
//    }
//}