/*
 *
 * Java classes are grouped into packages. The import statement tells the compiler which package to look in to find a class
 *
 * The * is a wildcard that matches all classes in the package. Every class in  this package is available for the program. It doesn't
 * import child packages, fields or methods, it imports only classes. A wildcard is not slows down the program.
 *
 * Special package java.lang. This package is automatically imported. It is not necessary to import this classes but you can if you want.
 *
 * Java looks automatically in the current package for other classes. It is not necessary to import this classes
 *
 */

package basics.package_declaration_imports;

//import java.util.Random; // import Random class

import java.util.*; // imports Random and other classes in that package

public class PackageDeclarationsImports {

    public static void main(String[] args) {
        Random random = new Random(); // Does only compile if import is set

        System.out.println(random.nextInt(10)); // print a number between 0 and 9
    }
}