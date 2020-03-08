package exam;

abstract interface Example {

    public default int getSpeed() {
        return 5;
    }

    public default int getPageWidth() {
        return 20;
    }
}

public abstract interface Voorbeeld extends Example {

    public static final int MAXIMUM_DEPT = 100;

    public abstract void myMethod();

    public abstract void myMethod(int speed);

    public default int getSpeed() {
        System.out.println("Overrides default in Example");
        return 5;
    }

    public int getPageWidth();

    public static int getHeight() {
        return 8;
    }
}

abstract class AbstractPaper implements Voorbeeld, Example {
    // not required to implement interface
}

class Dog implements Voorbeeld, Example {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.getSpeed();

        Voorbeeld.getHeight();
    }

    public int getSpeed() {
        System.out.println("overrides defaults, without this default it wil not compile because of implement same defaults");
        return 1;
    }

    @Override
    public int getPageWidth() {
        return 0;
    }

    @Override
    public void myMethod() {

    }

    @Override
    public void myMethod(final int speed) {

    }
}