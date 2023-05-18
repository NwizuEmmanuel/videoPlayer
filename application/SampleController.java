package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class SampleController implements Initializable{

	@FXML
	private MediaView mediaView;
	
	private File file;
	private  Media media;
	private MediaPlayer mediaPlayer;

	@FXML
	void pauseMedia(ActionEvent event) {
		mediaPlayer.pause();
	}

	@FXML
	void playMedia(ActionEvent event) {
		mediaPlayer.play();
	}

	@FXML
	void stopMedia(ActionEvent event) {
		mediaPlayer.stop();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		file = new File("src/publicFiles/video.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
	}
	

}
