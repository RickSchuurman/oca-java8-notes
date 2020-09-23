package basics.creating_objects;


// Read and write instance variable

public class ReadingWritingObjectsFields {

    int numberEggs; // instance variable

    public static void main(String[] args) {
        ReadingWritingObjectsFields mother = new ReadingWritingObjectsFields();

        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // get variable
    }
}


// Read and write fields directly on the line declaring them

class Name {

    int number1 = 1; // write field
    int number2 = 2; // write field
    int sum = number1 + number2; // read number1 and number2 and writes the field sum
}