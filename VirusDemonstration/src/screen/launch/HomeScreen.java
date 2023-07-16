package screen.launch;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import screen.controller.HomeScreenController;

public class HomeScreen extends JFrame {
    private String title;
    private String fxmlPath;

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
                    fxPanel.setScene(new Scene(root, 1440, 755));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        this.setSize(1440, 755); // Set the fixed size of the JFrame to match the Scene's fixed size
        this.setResizable(false); // Disable resizing of the JFrame

        // Add a WindowAdapter to prompt for confirmation when clicking close
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmAndDispose();
            }
        });
    }

    private void confirmAndDispose() {
        int option = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to exit?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            // Close the current frame when the user confirms
            disposeCurrentFrame();
        }
    }

    private void disposeCurrentFrame() {
        this.dispose();
    }

    // Override the processWindowEvent method to handle the WINDOW_CLOSING event
    @Override
    protected void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            confirmAndDispose();
        } else {
            super.processWindowEvent(e);
        }
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