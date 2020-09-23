package operators_and_statements.statements;

/*
 * Do while will be execute at least once
 *
 */

public class WhileStatement {

    public static void main(String[] args) {
        eatCheese(3);
        doWhile();

    }

    static int roomInBelly = 5;

    public static void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            System.out.println(bitesOfCheese);
            roomInBelly--;
            System.out.println(roomInBelly);
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
        System.out.println(roomInBelly + " room in belly");
    }

    public static void doWhile() {

        int x = 0;

        do {
            ++x;
        } while (false); // the statement block was still executed once and the program outputs a 1
        System.out.println(x);
    }


    // output 11
    {
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if (i == 8) keepGoing = false;
            result = -2;
        } while (keepGoing);
    }


//    public static void doWhileDeclareOutOfScope() {
//        do {
//            int x = 0;
//        } while (x < 10); // x is declared in the body of do While, it is out of scope in the while
//    }
}



