package screen.launch;
import javafx.embed.swing.JFXPanel;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import screen.controller.mainScreenController;

import java.io.IOException;

import javax.swing.JFrame;
import javafx.fxml.FXMLLoader;

public class mainScreen extends JFrame {
    public mainScreen() {
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Virusses Demonstration");
        this.setVisible(true);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/fxml/mainScreen.fxml"));
                    mainScreenController controller = new mainScreenController();
                    loader.setController(controller);
                    Parent root = (Parent) loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        this.setSize(715, 498);
    }
    public static void main(String[] args){
        mainScreen screen = new mainScreen();
    }
}

// public class mainScreen extends Application {

//     public void start (Stage primaryStage) throws Exception {
//         Parent root = FXMLLoader.load(getClass().getResource("VirusDemonstration/src/screen/fxml/mainScreen.fxml"));
//         Scene scene = new Scene(root, 600, 300);

//         primaryStage.setTitle("Virus demonstration");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     public static void main(String args[]){          
//         launch(args);     
//      }     
// }