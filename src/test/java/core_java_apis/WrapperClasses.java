package core_java_apis;

/*
 * Each primitve type has a wrapper class, which is an object type that corresponds to the primitive
 *
 */

public class WrapperClasses {

    public static void main(String[] args) {


        // method that converts back to a primitive

        int primitive = Integer.parseInt("123");  // converts String to int primitive
        Integer wrapper = Integer.valueOf("123"); // converts String to Integer wrapper class

//        int bad1 = Integer.parseInt("a"); // not compile letters and dots are not valid for an integer value
    }
}
