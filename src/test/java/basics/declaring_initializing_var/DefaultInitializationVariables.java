/*
 *
 * A local variable is a variable within a method, they must be initialized before use.
 * A local variable don't have a default value
 *
 * Variable that are not local variable are known as instance variables or class variables
 * Class variable are share across multiple objects (keyword static before it)
 * Instance and Class variables do not require you to initialized them. As soon as you declare these variables, the give a default value
 *
 *
 * default value reference type = null
 * default value primative = 0 / false
 * - boolean = false
 * - byte, short, int, long = 0
 * - float, double = 0.0
 * - char = '\u0000'
 * - all reference objects (like String) = null
 *
 */

package basics.declaring_initializing_var;

public class DefaultInitializationVariables {

    public static void main(String[] args) {

        findAnswer(true);

//    public int notValid() {
//        int y = 10;
//        int x; // Variable not initialized
//        int reply = y + x; // DOES NOT COMPILE
//        ret

    }

    public static void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch); // DOES NOT COMPILE, onlyOneBranch might not have been initialized
    }
}
