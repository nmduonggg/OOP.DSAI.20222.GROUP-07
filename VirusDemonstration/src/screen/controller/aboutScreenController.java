package screen.controller;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;

public class aboutScreenController extends homeScreenController {
    @FXML private TextArea aboutArea;
    
    @Override
    public void initialize() {
        aboutArea.setVisible(true);
        aboutArea.setEditable(false);
    }
}
