package screen.launch;
import screen.controller.*;

public class aboutScreen extends homeScreen {
    public aboutScreen() {
        super("About us", "/screen/fxml/aboutScreen.fxml", new aboutScreenController());
    }
}

