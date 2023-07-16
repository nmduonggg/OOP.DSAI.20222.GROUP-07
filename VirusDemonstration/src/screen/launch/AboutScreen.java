package screen.launch;
import screen.controller.*;

public class AboutScreen extends HomeScreen {
    public AboutScreen() {
        super("About us", "/screen/fxml/aboutScreen.fxml", new AboutScreenController());
    }
}

