package screen.launch;
import javafx.embed.swing.JFXPanel;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import screen.controller.*;


import java.io.IOException;

import javax.swing.JFrame;
import javafx.fxml.FXMLLoader;


public class helpScreen extends JFrame {
    public helpScreen() {
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Help");
        this.setVisible(true);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/fxml/helpScreen.fxml"));
                    helpScreenController controller = new helpScreenController();
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

