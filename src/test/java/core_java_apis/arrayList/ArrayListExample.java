package core_java_apis.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {


        {
            // old examples < java 5
            ArrayList list1 = new ArrayList(); // empty list
            ArrayList list2 = new ArrayList(10); // list with size 10
            ArrayList list3 = new ArrayList(list2); // copy of list 2 size and elements
        }

        {
            // new > java 5 where you can specify type

            ArrayList<String> list4 = new ArrayList<String>();
            ArrayList<String> list5 = new ArrayList<>(); // right site not mandatory since java 7, still you need to use <>
        }

        {
            // ArrayList implements an interface called List (arrayList is a list)
            // You can store an ArrayList in a List but not vice versa
            // Reason is that List is a interface and interfaces can't be instantiated

            List<String> list6 = new ArrayList<>();
//            ArrayList<String> list7 = new List<>(); // DOES not compile

        }
        {
            // Type is  not specified so the type is Object which includes everything
            ArrayList list = new ArrayList();
            list.add("Hawk"); // [Hawk]
            list.add(Boolean.TRUE); // [Hawk, true]
            list.add(1);
            System.out.println(list);
        }

        {
            // Type be specified can only be reference type NOT primitive
            ArrayList<String> list2 = new ArrayList<>();
            list2.add("Hawk");
//            list2.add(Boolean.TRUE); // NOT COMPILE, it is not a String
        }

        {
            // add values on different positions
            ArrayList<String> birds = new ArrayList<>();
            birds.add("Hawk"); // [Hawk]
            birds.add(1, "robin"); // [Hawk, robin]
            birds.add(0, "blue jay"); // [blue jay, Hawk, robin]
            birds.add(1, "cardinal"); // [blue jay, cardinal, Hawk, robin]
            System.out.println(birds); // [blue jay, cardinal, Hawk, robin]
        }

        {
            // remove ArrayList
            // remove() the first matching value in the ArrayList or remove the element at a specified index

            List<String> birds = new ArrayList<>();
            birds.add("Hawk"); // prints [Hawk]
            birds.add("Hawk"); // prints [Hawk, Hawk]
            System.out.println(birds.remove("cardinal")); // prints false, cardinal not exist in List
            System.out.println(birds.remove("Hawk")); // prints true
            System.out.println(birds); // prints [Hawk]
            System.out.println(birds.remove(0)); // prints []
        }

        {
            // Set ArrayList
            // Change one of the elements

            List<String> birds = new ArrayList<>();
            birds.add("Hawk");
            System.out.println(birds); // prints Hawk
            birds.set(0, "test");
            System.out.println(birds); // prints test
        }

        {
            // isEmpty() and size()

            List<String> birds = new ArrayList<>();
            System.out.println(birds.isEmpty()); // true
            System.out.println(birds.size()); // 0
            birds.add("Hawk");
            System.out.println(birds.isEmpty()); // false
            System.out.println(birds.size()); // 1
        }

        {
            // clear()
            // discard all elements of the ArrayList

            List<String> birds = new ArrayList<>();
            birds.add("Hawk");
            birds.add("Hawk");
            System.out.println(birds.size()); // prints 2
            birds.clear();
            System.out.println(birds.size()); // prints 0
        }

        {
            // contains()
            // checks whether a certain value is in the ArrayList

            List<String> birds = new ArrayList<>();
            birds.add("Hawk");
            System.out.println(birds.contains("Hawk")); // true
            System.out.println(birds.contains("Monkey")); // false
        }

        {
            // equals()

            // ArrayList has a custom implementation of equals() so you can compare
            // two list to see if the contain the same elements in the same order (this is not available on Array)

            List<String> one = new ArrayList<>();
            List<String> two = new ArrayList<>();
            System.out.println(one.equals(two)); // prints true
            one.add("a");
            System.out.println(one.equals(two)); // prints false
            two.add("a");
            System.out.println(one.equals(two)); // prints true
            one.add("b"); //[a, b]
            two.add(0, "b"); // [b, a]
            System.out.println(one.equals(two)); // prints false
        }

        List list = new ArrayList();
        list.add("val1"); //1
        list.add(1, "val3"); //3
        list.add(2, "val2"); //2
        System.out.println(list);
    }
}

