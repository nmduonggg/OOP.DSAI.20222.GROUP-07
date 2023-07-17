package screen.launch;

import screen.controller.HelpScreenController;

public class HelpScreen extends HomeScreen {
    public HelpScreen() {
        super("Help", "/screen/fxml/helpScreen.fxml", new HelpScreenController());
    }
}
    