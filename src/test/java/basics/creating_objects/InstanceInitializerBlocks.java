/*
 *
 * A code block outside the method is called instance initializer
 *
 */

package basics.creating_objects;

public class InstanceInitializerBlocks {

    public static void main(String[] args) {

        // Run when method is called
        {
            System.out.println("code block inside a method");
        }
    }

    // Not run when method is called because outside the method
    {
        System.out.println(" instance initializer");
    }
}
