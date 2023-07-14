package screen.launch;
import javafx.embed.swing.JFXPanel;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import screen.controller.*;


import java.io.IOException;

import javax.swing.JFrame;
import javafx.fxml.FXMLLoader;


public class homeScreen extends JFrame {
    String title;
    String fxmlPath;
    public homeScreen(String title, String fxmlPath, homeScreenController controller) {

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
                    // aboutScreenController controller = new aboutScreenController();
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

