package screen.controller;

import screen.launch.aboutScreen;
import screen.launch.helpScreen;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class mainScreenController extends homeScreenController {
    @FXML private Button btnEnvelope;
    @FXML private Button btnNoEnvelope;
    @FXML private Button btnCoronaVirus;
    @FXML private Button btnHerpesVirus;
    @FXML private Button btnAdenoVirus;
    @FXML private Button btnPapVirus;
    @FXML private Button btnQuit;

    @FXML @Override
    public void initialize() {
        btnEnvelope.setVisible(true);
        btnNoEnvelope.setVisible(true);
        btnHerpesVirus.setVisible(false);
        btnCoronaVirus.setVisible(false);
        btnAdenoVirus.setVisible(false);
        btnPapVirus.setVisible(false);
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
        btnCoronaVirus.setVisible(true);
        btnHerpesVirus.setVisible(true);
        btnAdenoVirus.setVisible(false);
        btnPapVirus.setVisible(false);
    }

    @FXML
    private void btnNoEnvelopeClicked(ActionEvent event) {
        btnAdenoVirus.setVisible(true);
        btnPapVirus.setVisible(true);
        btnCoronaVirus.setVisible(false);
        btnHerpesVirus.setVisible(false);
    }

    
    @FXML
    private void btnCoronaVirusClicked(ActionEvent event) {

    }

    
    @FXML
    private void btnHerpesVirusClicked(ActionEvent event) {

    }

    
    @FXML
    private void btnAdenoVirusClicked(ActionEvent event) {

    }

    
    @FXML
    private void btnPapVirusClicked(ActionEvent event) {

    }

    


}