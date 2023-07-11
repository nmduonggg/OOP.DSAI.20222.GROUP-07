package screen.controller;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;

public class aboutScreenController {
    @FXML private TextArea aboutArea;
    
    public void initialize() {
        aboutArea.setVisible(true);
        aboutArea.setEditable(false);
    }
}
