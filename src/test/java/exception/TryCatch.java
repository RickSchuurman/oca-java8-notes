package exception;


public class TryCatch {

    public static void main(String[] args) {

    }


    /*
     * line 17 calls the fall() method. Line 26 throws an exception. Java jumps to the catch block, skipping line 18.
     * getup() on line 20 is called next and the try statement is over and execution proceeds normally with line 22.
     */

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            // getUp();
        }
//        walk();
    }

    void fall() {
        throw new RuntimeException();
    }



    /*
     *  The try statement can have code within a finally clause regardless of whether an exception is thrown.
     *  If an exception is thrown, the finally block is run after the catch block. If no exception is thrown, the finally block is run after the try block completes.
     *  The try catch and finally blocks must be in the right order.
     */

//    void aDay() {
//        try {
//            walk();
//            fall();
//        } catch (Exception e) {
//           // report();
//        } finally {
//            // keepWalking();
//        }
//        // goHome();
//    }
//
//    void fall() {
//        throw new RuntimeException();
//    }
}
