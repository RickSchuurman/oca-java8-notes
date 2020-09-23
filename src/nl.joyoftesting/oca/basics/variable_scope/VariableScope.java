/*
 * Local variables in scope from declaration to end of block
 * Instance variables are available as soon as they are defined and last for the entire lifetime of the object itself
 * Class (static) variables go into scope when declared stay in scope for the entire lifetime of the program
 *
 */

package basics.variable_scope;

public class VariableScope {

    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        mouse.grow(1);
    }

    // local variable cannot used outside the method
    public static void eat(int pieceOfCheese) { // local variable called method parameter
        int bitesOfCheese = 1; // local variable
    }


    // local variable can never have a scope larger than the method they are defined in. But the can have a smaller scope

    public static void eatIfHungry(boolean hungry) { // hungry has a scope for the entire method
        if (hungry) {
            int bitesOfCheese = 1; // scope is limited to this block
        }
//        System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }

    public static void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese); // smaller contained blocks can reference variables defined in the larger blocks, not vice versa
            }
        }
//        System.out.println(teenyBit); // DOES NOT COMPILE, variable goes out of scope on line 30
    }
}

class Mouse {

    static int MAX_LENGTH = 5; // Class variable
    int length; // Instance variable

    public void grow(int inches) { // local variable, method parameter
        if (length < MAX_LENGTH) { // length available entire lifetime object, MAX_LENGTH available entire life time program
            int newSize = length + inches; // local variable
            length = newSize;
            System.out.println(length); // prints 1
        }
        System.out.println(length); // prints 1
    }
}

