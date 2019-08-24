/*
 *
 * Primitive types have lowercase type names. All classes that come with Java begin with Uppercase
 *
 */

package basics.ReferencesAndPrimitives;

public class KeyDifferences {

    public static void main(String[] args) {

        // Primitive type will give a compile error if you assign null
        // int value = null;

        // Reference type can be assigned null, which mean they do not currently refer to an object
        String s = null;

        // Reference type can be used to call methods when the do not point to Null
        // Primitives do not have methods declare on them
        String reference = "Hello";
        int length = reference.length();
        System.out.println(length);
    }
}
