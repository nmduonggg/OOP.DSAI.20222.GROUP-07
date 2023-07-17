package screen.launch;

import screen.controller.HelpScreenController;
import screen.controller.HomeScreenController;

public class HelpScreen extends HomeScreen {
    public HelpScreen() {
        super("Help", "/screen/fxml/helpScreen.fxml", new HelpScreenController());
    }
}
    