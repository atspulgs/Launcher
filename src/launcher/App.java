/*
 * 
 */
package launcher;

import java.io.File;
import javafx.scene.layout.Region;

/**
 *
 */
public class App extends Region implements AppThreadListener {
    public enum Status {
        RUNNING("Running"),
        STOPPED("Stopped");
        private final String name;
        private Status(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
    private final String name;
    private final File reference;
    public App(String name, String location) {
        this.name = name;
        this.reference = new File(location);
    }
    
    private static Object scrutinizeFile(String location) {
        
        /*
            1. Determine if location is valid
            2. Determine if file exists
            3. Determine if the file is a file or a folder
            4. Setermine if he file is a jar file (the right file)
            5. Look at jar files manifest. (version, help scripts, default run command, etc.)
            6. Compile data from the manifest file.
            7. Compile and return this data.
        */
        return null;
    }

    @Override
    public void update(AppThreadEvent event) {
        
    }
}
