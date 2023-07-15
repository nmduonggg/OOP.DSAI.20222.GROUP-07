package screen.controller;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextArea;

import Virus.Virus;
import Virus.VirusWithEnvelope.VirusWithEnvelope;
import screen.launch.MainScreen;

public class VirusStructureScreenController extends MainScreenController {
    String virusName;
    String virusFamily;
    String virusAcid;
    String virusCapsid;
    String structureBG;
    String envelope = "None";


    @FXML private TextField tfVirusName;
    @FXML private TextField tfVirusFamily;
    @FXML private TextField tfVirusAcid;
    @FXML private TextArea taVirusCapsid;
    @FXML private TextField tfVirusEnvelope;
    @FXML private Button btnMechanism;
    @FXML private Pane paneVirusCenter;
    @FXML private BackgroundImage virusBI;


    public void initialize() {

        btnMechanism.setVisible(true);
        tfVirusName.setText(virusName);
        tfVirusFamily.setText(virusFamily);
        tfVirusAcid.setText(virusAcid);
        taVirusCapsid.setText(virusCapsid);
        taVirusCapsid.setWrapText(true);
        
        tfVirusEnvelope.setText(envelope);
        virusBI = new BackgroundImage(new Image(structureBG, 424, 473, true,true),
                                                                BackgroundRepeat.REPEAT, 
                                                                BackgroundRepeat.NO_REPEAT, 
                                                                BackgroundPosition.DEFAULT,
                                                                BackgroundSize.DEFAULT);
        paneVirusCenter.setBackground(new Background(virusBI));


    }

    public VirusStructureScreenController(Virus virus) {
        virusName = virus.getName();
        virusFamily = virus.getFamily();
        virusAcid = virus.getAcidNucleic().getTypeAcidNucleic();
        virusCapsid = virus.getCapsid().getTypeCapsid();
        structureBG = virus.getStructure();

        if (virus instanceof VirusWithEnvelope) {
            VirusWithEnvelope virusE = (VirusWithEnvelope) virus;
            envelope = virusE.getEnvelope().getTypeEnvelope();
        }
    }

    @FXML
    public void btnMechanismClicked(ActionEvent event) {
        // mechanism class shows here
    }

    @FXML @Override
    protected void menuItemMenuClicked(ActionEvent event) {
        MainScreen screen = new MainScreen();

    }
}
