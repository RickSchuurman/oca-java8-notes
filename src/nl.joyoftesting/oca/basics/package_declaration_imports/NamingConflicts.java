/*
Class names don't have to be unique across all of java
 */

package basics.package_declaration_imports;

// NOT COMPILE, class is found in multiple packages
// import java.sql.Date;
// import java.util.Date;

// NOT COMPILE,
// import java.sql.*;
// import java.util.*;

// DOES COMPILE, If you explicitly import a class name, it takes precedence over any wildcards present
// import java.util.Date;
// import java.sql.*

import java.util.Date;

public class NamingConflicts {

    public static void main(String[] args) {
        Date date;
        java.sql.Date sqlDate; // if you really do want tu use Date from different packages.
    }
}
