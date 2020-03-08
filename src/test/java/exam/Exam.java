package exam;

class SomeThrowable extends Throwable {

}

class MyThrowable extends SomeThrowable {

}

public class Exam {

    public static void main(String[] args) throws SomeThrowable{
        try {
            m1();
        } catch (SomeThrowable e) {
            System.out.println("catch");
            throw e;
        } finally {
            System.out.println("Done");
        }
    }

    public static void m1() throws SomeThrowable {
        throw new SomeThrowable();
    }
}
