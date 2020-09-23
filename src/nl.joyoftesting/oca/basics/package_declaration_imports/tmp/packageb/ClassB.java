/*
 *
 * Run this program from c:/tmp works because both packagea and packageb are underneath it.
 *
 * JAR file is like a zip file of mainly Java class files.
 *
 */

package basics.package_declaration_imports.tmp.packageb;

import packagea.ClassA;

public class ClassB {

    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
    }

}
