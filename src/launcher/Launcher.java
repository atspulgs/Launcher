/*
 * 
 */
package launcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 */
public class Launcher extends Application{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch();
    }
    
    private Stage stage;
    private Scene mainScene;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        this.stage.setTitle("Ats Launcher");
        
        
        this.stage.show();
    }
}
