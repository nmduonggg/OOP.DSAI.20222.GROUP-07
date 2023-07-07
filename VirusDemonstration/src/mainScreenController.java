import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;

public class mainScreenController {
    @FXML private Button btnEnvelope;
    @FXML private Button btnNoEnvelope;


    @FXML
    private void initialize() {
        btnEnvelope.setVisible(true);
        btnNoEnvelope.setVisible(true);
    }

    @FXML
    private void menuItemHelpClicked(ActionEvent event) {
        
    }

    @FXML 
    private void menuItemAboutClicked(ActionEvent event) {
        
    }

    @FXML
    private void menuItemMenuClicked(ActionEvent event) {
        // mainScreen screen = new mainScreen();

    }

    @FXML
    private void btnEnvelopeClicked(ActionEvent event) {

    }

    @FXML
    private void btnNoEnvelopeClicked(ActionEvent event) {

    }


}