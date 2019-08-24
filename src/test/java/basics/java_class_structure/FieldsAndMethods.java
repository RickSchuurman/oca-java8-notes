package basics.java_class_structure;

/*
 *
 * Members of the class: Fields hold the state of the program and Methods operate on the state
 *
 */

// Java calls a word with special meaning a keyword. Keywords in this example are public, class, return and void
public class FieldsAndMethods {

    // Define a variable named name and define the type of that variable to be a String
    String name;

    // Define method named getName with a return type String
    public String getName() {
        return name;
    }

    // The full declaration of a method is called method signature
    // Define method named setName with a return type void. Void means that no value at all is returned
    // This method has one parameter named newName and it is of type String
    public void setName(String newName) {
        name = newName;
    }
}
