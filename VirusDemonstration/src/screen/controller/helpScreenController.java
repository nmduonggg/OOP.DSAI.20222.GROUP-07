package screen.controller;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;

public class helpScreenController extends homeScreenController {
    @FXML private TextArea helpArea;
    
    @Override
    public void initialize() {
        helpArea.setVisible(true);
        helpArea.setEditable(false);
    }
}
