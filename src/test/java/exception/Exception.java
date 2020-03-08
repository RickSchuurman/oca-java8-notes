/*
 * Runtime exceptions are also known as unchecked exceptions, for example, accessing an invalid array index is unexpected.
 * A runtime (unchecked) exception is a specific type of exception. All exceptions occur at the time that the program is run.
 * An example of a runtime exception is a NullPointerException, which happens when you try to call a member on a null reference.
 *
 * A checked exception includes Exception and all subclasses that do not extend RuntimeException.
 * Checked exceptions tend to be more anticipated-for example, trying to read a file that doesn't exist.
 * For checked exceptions, Java requires the code to either handle them or declare them in the method signature
 *
 * The code can use throw keyword to throw an exception. Java can write statements like these:
 * throw new Exception();
 * throw new Exception("Hi");
 * throw new RuntimeException();
 * throw new RuntimeException("Runtime.");
 *
 * The first type is Runtime exception which is the subclass of RuntimeException. For Runtime Exception we can catch them in the code but we are not required to do so.
 * The second type is the Checked exception which is Subclass of Exception but not subclass of RuntimeException. For the checked exception we are required to catch them.
 * The last type is the Error which is the Subclass of Error. We cannot catch them and are not required to catch them.
 *
 *
 */


package exception;

public class Exception extends Throwable {

    public static void main(String[] args) {
        arrayIndexOutOfBoundsExpeption();
    }

    // throw tells Java that you want to throw an Exception.
    // throws declares that the method might throw an Exception. It might not.
    void fall() throws Exception {
        throw new Exception();
    }

    // This code throws an ArrayIndexOutOfBoundsException.
    static void arrayIndexOutOfBoundsExpeption() {
        String[] animals = new String[0]; // array met length 0
        System.out.println(animals[0]);
    }


}
