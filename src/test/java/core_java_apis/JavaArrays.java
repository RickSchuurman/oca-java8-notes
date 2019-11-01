package core_java_apis;

public class JavaArrays {

    public static void main(String[] args) {

        {
            // basic structure array
            int[] numbers1 = new int[3]; // type of array (int) and the size (3)

            // numbers1 is a reference variable that points to the object like below
            // |0|0|0|
            // |0|1|2|

            // default value of int is (0)
        }

        {
            // array that specifies all the elements

            int[] numbers2 = new int[]{42, 55, 29};

            // |42|55|29|
            // |0 |1 |2 |

            // example above is redundant since java knows the type of the array on the left side of the equal sign
            // and it knows the size

            int[] numbers3 = {42, 55, 29}; // called anonymous approach


            // also allowed
            int [] numbers4 = {42, 55, 29};
            int numbers5 [] = {42, 55, 29};
            int numbers6[] = {42, 55, 29};


            {
                int ids[], types; // first is a array the second a int
                ids = new int[]{1, 2, 3};
                types = 1;
            }

            {
                // the equals method of a array does not look at the elements only reference
                String [] bugs = { "cricket", "beetle"};
                String [] alias = bugs;
                System.out.println(bugs.equals(alias) ); // prints true
                System.out.println(alias.toString()); // prints [Ljava.lang.String;@60e53b93 // L is a array, java.lang.String is the type, @60e53b93 is the hash
                System.out.println(java.util.Arrays.toString(bugs)); // prints [cricket, beetle]
            }

            {
                String names[]; // points to null

                String names1[] = new String[2];

//                |null|null|
//                |0   |1   |


            }

        }
    }
}
