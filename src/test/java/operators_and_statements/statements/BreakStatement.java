package operators_and_statements.statements;

public class BreakStatement {

    public static void main(String[] args) {
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
//                    break PARENT_LOOP; // Print Value 2 found at: (1,1) after first hit it will break the parent loop
                    break; // Print Value 2 found at: (2,0), exit the inner loop
                    // NO BREAK will found last value (2,2)
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
        }
    }
}
