package basics.java_class_structure;

/*
 * Type psvm for creating public static void main in the IDE (IntelliJ)
 *
 * A Java program begins execution with its main() method. A main() method is the gateway between the startup of a Java process
 * which is managed by the Java Virtual Machine (JVM)
 *
 * To compile this code type javac MainMethod.java
 * To execute this code type java MainMethod without .class extension because this is a reserved meaning in JVM
 *
 * To compile Java code, the file must have the extension .java and the name of the file must match the name of the class including case
 * the result is a file of bytecode with the same name but with a .class extension. Bytecode consists of instructions
 * that the JVM knows how to execute
 *
 * Main method changes the program state from started to finish (void method change object state)
 *
 * Main method parameters list represented as an array of java.lang.String objects
 *
 */

/*
 *
 * Execute
 * javac MainMethod.java
 * java MainMethod "argument 1" argument2 3
 *
 */

public class MainMethod {

    public static void main(String[] args) {
        System.out.println("arg " + args[0]); // Results argument 1, use quotes if you want to use space
        System.out.println("arg " + args[1]); // Results argument2
        System.out.println("arg " + args[2]); // Results 3 as String, even if the present an other data type like int
        System.out.println("arg " + args[3]); // Java prints exception
    }
}
