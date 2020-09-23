package exception;

class MyException extends java.lang.Exception {}

class TestClass {

    public static void main(String[] args) throws java.lang.Exception {
        TestClass tc = new TestClass();
        try{
            tc.m1();
        }
        catch (MyException e){
            tc.m1();
//            try {
//                tc.m1();
//            } catch (MyException ee) {
//                System.out.println("lol");
//            }
        }
        finally {
            tc.m2();
        }
    }

    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }

}


/*
als je een checked Exception gooit moet je:
1. catchen
of
2. via throws clausule naar boven doorgeven
 */