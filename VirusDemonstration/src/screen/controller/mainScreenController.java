package screen.controller;

import screen.launch.aboutScreen;
import screen.launch.helpScreen;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.event.ActionEvent;


public class mainScreenController {
    @FXML private Button btnEnvelope;
    @FXML private Button btnNoEnvelope;


    @FXML
    public void initialize() {
        btnEnvelope.setVisible(true);
        btnNoEnvelope.setVisible(true);
    }

    @FXML
    private void menuItemHelpClicked(ActionEvent event) {
        helpScreen help = new helpScreen();
    }

    @FXML 
    private void menuItemAboutClicked(ActionEvent event) {
        aboutScreen about = new aboutScreen();
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