package screen.launch;
import screen.controller.MainScreenController;

public class MainScreen extends HomeScreen {
    public MainScreen() {
        super("Virus Demonstration", "/screen/fxml/mainScreen.fxml", new MainScreenController());
    }
}