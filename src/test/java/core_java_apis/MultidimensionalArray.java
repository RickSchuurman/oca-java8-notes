package core_java_apis;

public class MultidimensionalArray {

    public static void main(String[] args) {
        {
            int[][] vars1; // 2D array
            int vars2[][]; // 2D array
            int[] vars4[], vars5[][]; // 2D array And 3D array
        }

        {
            String[][] rectangle = new String[3][2];

//            |0 | 1 | 2 |
//            |0 | 0 | 0 |
//            |1 | 1 | 1 |

            rectangle[0][1] = "set";

//            |0       | 1 | 2 |
//            |0       | 0 | 0 |
//            |1 = set | 1 | 1 |

        }


        {
            int[][] diffentSize = {{1, 4}, {3}, {9, 8, 7}};

//        |0     | 1     | 2     |
//        |0 - 1 | 0 - 3 | 0 - 9 |
//        |1 - 4 |       | 1 - 8 |
//        |      |       | 2 - 7 |
        }

        {
            int[][] twoD = new int[3][2];
//            int[][] twoD = {{1, 2}, {1, 2}, {1, 2}};
            for (int i = 0; i < twoD.length; i++) {
                for (int j = 0; j < twoD[i].length; j++)
                    System.out.println(twoD[i][j] + " ");
            }
        }

        {
            int[][] twoD = new int[3][2];

            for (int[] inner : twoD) {
                for (int num : inner) {
                    System.out.println(num + "  ");
                }
            }
        }
    }
}
