package core_java_apis;

import java.util.*;

public class ConvertingArrayAndList {

    public static void main(String[] args) {
        {
            // ArrayList to Array
            List<String> list = new ArrayList<>();
            list.add("Hawk");
            list.add("Robin");
            System.out.println(list); //[Hawk, Robin]
            Object[] objectArray = list.toArray(); // coverts to an Array, array of class object
            System.out.println(objectArray.length); // 2
            String[] stringArray = list.toArray(new String[0]); // converts to an Array of String object // specifying a size of 0 for the parameter is that Java will create a new array of the proper size for the return value
            System.out.println(stringArray.length); // 2
        }

        {
            // Array to ArrayList

            String[] array = {"Hawk", "Robin"}; // [Hawk, Robin]
            List<String> list = Arrays.asList(array); // returns fixed size list
            System.out.println(list.size()); // 2
            list.set(1, "test"); // [Hawk, test]
            array[0] = "new"; // [new, test]
            for (String b : array)
                System.out.println(b + " "); // new, test
            list.remove(0); // throws unsupportedOperation, we are not allowed to change the size of the list


        }
    }

}
