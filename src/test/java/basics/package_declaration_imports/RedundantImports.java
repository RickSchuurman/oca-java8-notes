package basics.package_declaration_imports;

// Use a wildcard
//import java.nio.file.*;

// Import both classes explicity

import java.nio.file.Files;
import java.nio.file.Paths;

// Not compile, a wild card only matches class names
// import java.nio.*;

// Not compile, you can only have one wildcard and it must be at the end
// import java.nio.*.*;

// Not compile, you cannot import methods
// import java.nio.files.Paths.*;

public class RedundantImports {

    public void read(Files files) {
        Paths.get("name");
    }
}
