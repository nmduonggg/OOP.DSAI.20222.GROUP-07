import javafx.embed.swing.JFXPanel;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;

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
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("mainScreen.fxml"));
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