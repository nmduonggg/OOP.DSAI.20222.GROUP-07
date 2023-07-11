package screen.controller;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;

public class helpScreenController {
    @FXML private TextArea helpArea;
    
    public void initialize() {
        helpArea.setVisible(true);
        helpArea.setEditable(false);
    }
}
