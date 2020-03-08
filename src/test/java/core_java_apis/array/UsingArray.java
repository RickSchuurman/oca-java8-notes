package core_java_apis.array;

import java.util.Arrays;

public class UsingArray {

    public static void main(String[] args) {
        {
            String[] mammels = {"Monkey", "Chimp", "Donkey"};
            System.out.println(mammels.length); // prints 3
            System.out.println(mammels[0]); // prints Monkey

        }

        {
            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] += 5;
                System.out.println(numbers[i]);
            }
        }


        /*
         * Numbers sort before letters
         * Uppercase sorts before lowercase
         */

        {
            // Sorting Arrays

            int[] numbers = {2, 7, 3};
            Arrays.sort(numbers);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }

        {
            // Sorting Arrays Int

            int[] numbers = {10, 9, 100};
            Arrays.sort(numbers);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]); // prints 9 , 10, 100
            }
        }

        {
            // Sorting Array STRING
            // Strings sorts in alphabetic order, and 1 sort before 9

            String[] numbers = {"10", "9", "100"};
            Arrays.sort(numbers);
            for (String number : numbers)
                System.out.println(number); // prints 10, 100, 9
        }

        {
            // Sorting Array STRING
            // numbers before letters

            String[] numbers = {"a", "900", "100", "A"};
            Arrays.sort(numbers);
            for (String number : numbers)
                System.out.println(number); // prints 100, 900, A, a
        }
    }
}
