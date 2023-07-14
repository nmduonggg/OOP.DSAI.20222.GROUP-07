package screen.launch;
import screen.controller.mainScreenController;

public class mainScreen extends homeScreen {
    public mainScreen() {
        super("Virus Demonstration", "/screen/fxml/mainScreen.fxml", new mainScreenController());
    }
    public static void main(String[] args){
        mainScreen screen = new mainScreen();
    }
}

