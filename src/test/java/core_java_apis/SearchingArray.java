package core_java_apis;

import java.util.Arrays;

public class SearchingArray {

    public static void main(String[] args) {

        // Array should be sorted
        {
            int[] numbers = {2, 4, 6, 8};
            System.out.println(Arrays.binarySearch(numbers, 2)); // prints index 0
            System.out.println(Arrays.binarySearch(numbers, 4)); // prints index 1
            System.out.println(Arrays.binarySearch(numbers, 1)); // prints index -1 expect index 0 and subtract with -1
            System.out.println(Arrays.binarySearch(numbers, 3)); // prints index -2 expect index 1 and subtract with -1
            System.out.println(Arrays.binarySearch(numbers, 9)); // prints index -5 expect index 4 and subtract with -1
        }

        // When array is not sorted the answer is unpredictable output
        {
            int[] numbers = {6, 8, 2, 2};
        }
    }
}
