package screen.controller;

import Virus.Virus;
import screen.launch.HomeScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import screen.launch.MainScreen;

public class VirusMechanismScreenController extends MainScreenController {

    @FXML private MediaView videoView;
    @FXML private TextArea taMechanism;

    Virus virus;
    String mechanism;
    MediaPlayer mediaPlayer;

    public VirusMechanismScreenController(Virus virus) {
        this.virus = virus;
        mechanism = virus.getMechanism();
    }

    public void initialize() {
        taMechanism.setText(virus.getMechanismSummary());
        taMechanism.setEditable(false);
        String mediaPath = VirusMechanismScreenController.class.getResource(mechanism).toExternalForm();
        Media media = new Media(mediaPath);
        mediaPlayer = new MediaPlayer(media);
        videoView.setMediaPlayer(mediaPlayer);
        mediaPlayer.setAutoPlay(false);
    }
    

    @FXML
    public void handleMediaViewClick(MouseEvent event) {
        if (mediaPlayer != null) {
            if (mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.play();
            }  
        }
    }

    @FXML @Override
    protected void menuItemMenuClicked(ActionEvent event) {
        MainScreenController controller = new MainScreenController();
        MainScreen menuScreen = new MainScreen(controller);
        this.screen.dispose();
        controller.set_screen(menuScreen);

    }
}
