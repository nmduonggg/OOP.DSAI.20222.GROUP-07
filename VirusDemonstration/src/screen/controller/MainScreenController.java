package screen.controller;

import screen.launch.VirusStructureScreen;
import screen.launch.AboutScreen;
import screen.launch.HelpScreen;
import screen.launch.MainScreen;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.Action;

import Virus.Virus;
import Virus.VirusManager;
import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;
import Virus.VirusWithEnvelope.Coronaviruses;
import Virus.VirusWithEnvelope.Envelope;
import Virus.VirusWithEnvelope.Glycoprotein;
import Virus.VirusWithEnvelope.Herpesviruses;
import Virus.VirusWithEnvelope.Retroviruses;
import Virus.VirusWithoutEnvelope.Adenoviruses;
import Virus.VirusWithoutEnvelope.Papillomaviruses;
import javafx.event.ActionEvent;


public class MainScreenController extends HomeScreenController {
    @FXML private Button btnEnvelope;
    @FXML private Button btnNoEnvelope;
    @FXML private Button btnCoronaVirus;
    @FXML private Button btnHerpesVirus;
    @FXML private Button btnAdenoVirus;
    @FXML private Button btnPapVirus;
    @FXML private Button btnRetroVirus;

    VirusManager virusManager = new VirusManager();


    @FXML @Override
    public void initialize() {
        btnEnvelope.setVisible(true);
        btnNoEnvelope.setVisible(true);
        btnHerpesVirus.setVisible(false);
        btnCoronaVirus.setVisible(false);
        btnAdenoVirus.setVisible(false);
        btnPapVirus.setVisible(false);
        btnRetroVirus.setVisible(false);
        virusManager.initialize();
    }

    @FXML
    protected void menuItemHelpClicked(ActionEvent event) {
        HelpScreen help = new HelpScreen();
    }

    @FXML 
    protected void menuItemAboutClicked(ActionEvent event) {
        AboutScreen about = new AboutScreen();
    }

    @FXML
protected void menuItemMenuClicked(ActionEvent event) {
    try {
        MainScreen screen = new MainScreen();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    @FXML
    private void btnEnvelopeClicked(ActionEvent event) {
        btnCoronaVirus.setVisible(true);
        btnHerpesVirus.setVisible(true);
        btnRetroVirus.setVisible(true);;
        btnAdenoVirus.setVisible(false);
        btnPapVirus.setVisible(false);
    }

    @FXML
    private void btnNoEnvelopeClicked(ActionEvent event) {
        btnAdenoVirus.setVisible(true);
        btnPapVirus.setVisible(true);
        btnCoronaVirus.setVisible(false);
        btnHerpesVirus.setVisible(false);
        btnRetroVirus.setVisible(false);
    }

    
    @FXML
    private void btnCoronaVirusClicked(ActionEvent event) { // SARS_Cov_2
        Coronaviruses cov2 = virusManager.getCoronavirus();
        VirusStructureScreenController controller = new VirusStructureScreenController(cov2);
        VirusStructureScreen structureScreeen = new VirusStructureScreen(controller);

    }

    
    @FXML
    private void btnHerpesVirusClicked(ActionEvent event) { // HSV1
        Herpesviruses hsv1 = virusManager.getHerpesvirus();
        VirusStructureScreenController controller = new VirusStructureScreenController(hsv1);
        VirusStructureScreen structureScreeen = new VirusStructureScreen(controller);

    }

    
    @FXML
    private void btnAdenoVirusClicked(ActionEvent event) { // Adenovirus
        Adenoviruses adeno = virusManager.getAdenovirus();
        VirusStructureScreenController controller = new VirusStructureScreenController(adeno);
        VirusStructureScreen structureScreeen = new VirusStructureScreen(controller);
    }

    
    @FXML
    private void btnPapVirusClicked(ActionEvent event) { // HPV
        Papillomaviruses hpv = virusManager.getPapilomavirus();
        VirusStructureScreenController controller = new VirusStructureScreenController(hpv);
        VirusStructureScreen structureScreeen = new VirusStructureScreen(controller);
    }

    @FXML 
    private void btnRetroVirusClicked (ActionEvent event) {  // HIV
        Retroviruses hiv = virusManager.getRetrovirus();
        VirusStructureScreenController controller = new VirusStructureScreenController(hiv);
        VirusStructureScreen structureScreeen = new VirusStructureScreen(controller);
    }
}

