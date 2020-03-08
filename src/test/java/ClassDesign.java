class D {

    public void method_class_D() {
        System.out.println("Print method D");
    }
}

class E extends D {

    public void method_class_E() {
        System.out.println("Print method E");
    }
}

class C extends E {

    public void method_class_C() {
        System.out.println("Print method C");
    }
}

public class ClassDesign {

    public static void main(String[] args) {
        C c = new C();
        E b = c;  // is fine
        D a = b;  // is fine




        c.method_class_D(); // is fine
        c.method_class_E(); // is fine
        c.method_class_C(); // is fine

        b.method_class_D(); // is fine
        b.method_class_E(); // is fine
//        b.method_class_C(); // wont work

        a.method_class_D(); // is fine
//        a.method_class_E(); // wont work
//        a.method_class_C(); // wont work


        ((C) a).method_class_C(); // Object a casten naar C
    }
}
