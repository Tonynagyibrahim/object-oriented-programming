
package projectwithgui;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ProjectWithGui extends Application {

    public void start(Stage primaryStage) throws FileNotFoundException{
        primaryStage.setTitle("Get Started");
        VBox v1=new VBox();
       GetStarted b1= new GetStarted( v1,primaryStage,900,600);
primaryStage.setScene(b1);
        primaryStage.show();
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
     launch (args);
     User.filluFileBeforeClosing();
     User.fillCarsFileBeforeClosing();
     User.fillRentersFileBeforeClosing();
    }
    
}
