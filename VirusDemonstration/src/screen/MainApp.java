package screen;

import screen.controller.MainScreenController;
import screen.launch.MainScreen;

public class MainApp {
    public static void main(String[] args){
        MainScreenController controller = new MainScreenController();
        MainScreen screen = new MainScreen(controller);
        controller.set_screen(screen);
    }
}
