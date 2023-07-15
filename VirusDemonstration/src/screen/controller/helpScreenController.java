package screen.controller;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;

public class HelpScreenController extends HomeScreenController {
    @FXML private TextArea helpArea;
    
    @Override
    public void initialize() {
        helpArea.setVisible(true);
        helpArea.setEditable(false);
    }
}
