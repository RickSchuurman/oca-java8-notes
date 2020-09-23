package core_java_apis;

import java.lang.*;

public class StringBuilderMethods {

    public static void main(String[] args) {

        // Methods substring, indexOf, length, charAt same as String

        {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("animals");
            String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // Index 0 and 4 // Sub anim // substring returns a String so its not change sb
            int len = sb.length(); // 7
            char ch = sb.charAt(6);  // s
            System.out.println(sub + len + ch); // anim7s

            System.out.println(sb); // animals
        }

        {
            // append()
            // add characters to the StringBuilder at the requested index and returns a reference to the current StringBuilder

            java.lang.StringBuilder sb1 = new java.lang.StringBuilder().append(1).append('c');
            sb1.append("-").append(true);
            System.out.println(sb1); // 1c-true automatically convert the parameters to String
        }

        {
            // insert()
            // same as append with uses of index

            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("animals");
            sb2.insert(7, "-"); // animals-
            sb2.insert(0, "-"); // -animals-
            sb2.insert(4, "-"); // -ani-mals-
        }

        {
            // delete() and deleteCharAt()
            // delete method is the opposite of the insert method

            // StringBuilder delete(int start, int end)
            // StringBuilder deleteCharAt(int index)

            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("abcdef");
            sb3.delete(1,3); // acdef
            sb3.deleteCharAt(5); // throws an exception
        }

        {
            // revers()
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("ABC");
            sb4.reverse(); // CBA
        }


        {
            //toString()
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("ABC");
            String s = sb5.toString();
        }
    }
}
