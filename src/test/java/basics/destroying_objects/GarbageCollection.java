/*

 * Java objects are stored in your program memory heap
 *
 * Garbage collection refers to the process of automatically freeing memory on the heap by deleting objects that no longer reachable in your program (eligible)
 * - The object no longer has any references pointing to it
 * - All references to the object has gone out of scope
 *
 * With System.gc() you can suggest to run the garbage collector. Java is free to ignore this request
 *
 *
 * finalyze() call could run zero or one time. And only runs when the object is eligible for garbage collection
 */

package basics.destroying_objects;

import java.util.Random;

public class GarbageCollection {

    public static void main(String[] args) {
        String one, two;
        one = new String("a"); // Reference one Object on the heap "a"
        two = new String("b"); // Reference two Object on the heap "b"
        one = two; // variabele one change to point "b"
        String three = one; // new variable what points to "b"
        one = null; // set value to NULL, this removes the point to object "b". Object is eligible for the garbage collection (out of scope after ending the method)
    }
}

class Rabit {

    public static void main(String[] args) {
        Random one = new Random();
        Random two = new Random();
        Random three = one;
        one = null;
        Random four = one;
        three = null;
        two = null;
        two = new Random();
        System.gc();
    }
}
