package operators_and_statements.statements;

public class NestedLoops {

    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.println(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
                System.out.println("do " + x); // Prints 18, 16, 14, 12, 10, 8, 6, 4 // in the second loop prints 1
            } while (x > 5); // iterate till x is not greater then 5
            x--; // decrease 4 with 1
            System.out.println(x + "\t"); // prints 3 // in the second loop prints 0
        }
    }
}

