package screen.launch;

import screen.controller.helpScreenController;

public class helpScreen extends homeScreen {
    public helpScreen() {
        super("Help", "/screen/fxml/helpScreen.fxml", new helpScreenController());
    }
}
    