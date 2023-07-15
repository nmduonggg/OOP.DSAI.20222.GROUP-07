package screen.launch;
import javafx.embed.swing.JFXPanel;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import screen.controller.*;

import javafx.stage.Stage;

import java.io.IOException;

import javax.swing.JFrame;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class HomeScreen extends JFrame {
    String title;
    String fxmlPath;
    public HomeScreen(String title, String fxmlPath, HomeScreenController controller) {

        this.title = title;
        this.fxmlPath = fxmlPath;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle(title);
        this.setVisible(true);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
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
}

// public class homeScreen extends Application {

//     String fxmlPath;
//     String title;
//     homeScreenController controller;
    
//     @Override
//     public void start(Stage stage) throws Exception {
//         FXMLLoader loader = new FXMLLoader(getClass().getResource(this.fxmlPath));
//         Parent root = (Parent) loader.load();
//         Scene scene = new Scene(root);
//         stage.setScene(scene);
//         stage.show();

//     }

//     public homeScreen(String title, String fxml, homeScreenController controller) {
//         this.fxmlPath = fxmlPath;
//         this.title = title;
//         this.controller = controller;
//     }
// }