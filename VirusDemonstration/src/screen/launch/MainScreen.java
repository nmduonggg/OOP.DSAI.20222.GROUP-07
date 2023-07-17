package screen.launch;
import screen.controller.HomeScreenController;
import screen.controller.MainScreenController;

public class MainScreen extends HomeScreen {
    public MainScreen(HomeScreenController controller) {
        super("Virus Demonstration", "/screen/fxml/mainScreen.fxml", controller);
    }
}