package screen.controller;

import Virus.Virus;
import Virus.VirusWithEnvelope.VirusWithEnvelope;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import screen.launch.HomeScreen;
import screen.launch.MainScreen;
import screen.launch.VirusMechanismScreen;

public class VirusStructureScreenController extends MainScreenController {
    String virusName;
    String virusFamily;
    String virusAcid;
    String virusCapsid;
    String structureBG;
    String envelope = "None";
    Virus virus;

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
        tfVirusName.setEditable(false);
        tfVirusFamily.setText(virusFamily);
        tfVirusFamily.setEditable(false);
        tfVirusAcid.setText(virusAcid);
        tfVirusAcid.setEditable(false);
        taVirusCapsid.setText(virusCapsid);
        taVirusCapsid.setEditable(false);
        taVirusCapsid.setWrapText(true);
        
        tfVirusEnvelope.setText(envelope);
        virusBI = new BackgroundImage(new Image(structureBG, 1190, 730, true,true),
                                                                BackgroundRepeat.NO_REPEAT, 
                                                                BackgroundRepeat.NO_REPEAT, 
                                                                BackgroundPosition.DEFAULT,
                                                                BackgroundSize.DEFAULT);
        paneVirusCenter.setBackground(new Background(virusBI));
    }

    public VirusStructureScreenController(Virus virus) {

        this.virus = virus;
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
        VirusMechanismScreenController mechanismController = new VirusMechanismScreenController(virus);
        VirusMechanismScreen mechanismScreen = new VirusMechanismScreen(mechanismController);
        this.screen.dispose();
        mechanismController.set_screen(mechanismScreen);
    }

    @FXML @Override
    protected void menuItemMenuClicked(ActionEvent event) {
        MainScreenController controller = new MainScreenController();
        MainScreen menuScreen = new MainScreen(controller);
        this.screen.dispose();
        controller.set_screen(menuScreen);
    }
}
