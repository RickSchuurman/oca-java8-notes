package operators_and_statements.statements;

/*
 * The right hand side of the for-each looop statement must be a build-in array or an object whose class implements java.lang.Iterable (array or iterable object)
 * The left hand side must include a declaration for an instance of a variablewhose type matches the type of a member of the array or collection
 *
 *
 */

public class ForEachStatement {

    public static void main(String[] args) {
        ForEachArray();
        ForEachList();

    }

    public static void ForEachArray() {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void ForEachList(){
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values ){
            System.out.println(value + ", ");
        }
    }

//    public static void NotAnArray(){
//        String names =  "Lisa";
//        for (String name : names){ // DOES NOT COMPILE, it is not a array or java.lang.iterable
//            System.out.println(name);
//        }
//    }

//
//    public static void NotTheSameType(){
//        String[] names = new String[3];
//        for (int name : names){ // Not compile because it is not the same type. Empty array null pointers is not a problem
//            System.out.println(name);
//        }
//    }



}
