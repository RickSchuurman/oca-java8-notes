package exam;

class MyException extends Exception {

}

class A extends java.lang.Object {

    private int a; // not accessible by class B
    protected int b = 4; // accessible by class B

    public A(int param) {
        super(); // should be on the firs rule
        this.a = param;
        this.b = param;
        System.out.println("A constructor with param");
    }

    public int methodA() throws Exception {
        System.out.println("methodA");
        throw new Exception();
    }

    protected int methodB() throws Exception {
        System.out.println("methodB");
        return 1;
    }

    private int methodC() throws Exception {
        System.out.println("methodC");
        return 1;
    }

    public int methodD() {
        System.out.println("methodD");
        return 1;
    }

    public final int methodE(int param) {
        return 1;
    }

    public static int methodF() {
        return 1;
    }

    public int methodGParent() {
        System.out.println("class a methodF is printed " + methodF());
        return 1;
    }

    private int methodH(){
        return 1;
    }
}

class B extends A {

    protected int b = 8;

    public B() {
        this(1); // calls param constructor in this class
        System.out.println("B constructor without param");
    }

    public B(int param) {
        super(param); // calls parent constructor with param
        System.out.println("B constructor with param");
    }

    public int methodA() throws Exception {
        System.out.println("overridden");
        System.out.println("both throw exception");
        System.out.println("super, get parent method and return Exception");
        return super.methodA();
    }

    public int methodB() throws MyException {
        System.out.println("overridden");
        System.out.println("MyException is a child of Exception, allowed");
        this.b = 2; // access member of parent class
        super.b = 3; // explicity reference a member of parent class
        return 1;
    }

    int methodC() {
        System.out.println("overridden, same signature");
        System.out.println("default is more accessible than private");
        System.out.println("Throw exception in the parent and not in the child is allowed");
        System.out.println("Child " + b + "Parent " + super.b);
        return 1;
    }

    public int methodD(int param) {
        System.out.println("overload");
        return 1;
    }

//    public int methodE(int param) {
//        System.out.println("Final can not overridden or Hidden");
//        return 1;
//    }

    public static int methodF() {
        System.out.println("hidden method because it is static");
        System.out.println("should both be static otherwise not compile");
        return 2;
    }

    public int methodGChild() {
        System.out.println("class b methodF is printed " + methodF());
        return 1;
    }

    private String methodH(){
        System.out.println("Will compile, method is hidden");
        return "";
    }
}

public class Main extends B {

    public Main() {
        super();
    }

    public static void main(String[] args) throws Throwable {
        B b = new B();

        /*
         * FIRST PRINT
         * A constructor with param
         * B constructor with param
         * B constructor without param
         */

        System.out.println("private a " + b.b); // private a 1

        try {
            b.methodD(); // methodD
            b.methodD(1); // overload
            b.methodC(); // overridden, same signature, default is more accessible than private, Throw exception in the parent and not in the child is allowed
            b.methodB(); // overridden, MyException is a child of Exception, allowed
            b.methodA(); // overridden, both throw exception, super, get parent method and return Exception, methodA, java.lang.Exception
        } catch (Exception e) {
            System.out.println(e);
        }

        Main m = new Main();
        m.methodGChild(); // static, class b methodF is printed 2 // not static, class b methodF is printed 2
        m.methodGParent(); // static, class a methodF is printed 1 // not static, class a methodF is printed 2


    }
}



