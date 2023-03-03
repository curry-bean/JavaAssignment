package javafxmultimedia;


/**
 *
 * @author aloha-tech
 */

import java.io.File;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		// path to the Music file
		String pathToFile = 
			"/home/aloha-tech/Downloads/Poems/dist;
		
		// instantiate the JavaFX media class
		Media media = new Media(new File(pathToFile).toURI().toString());
		
		// instantiate JavaFX media player class
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		// set the auto play property to true for the audio to be played
		mediaPlayer.setAutoPlay(true);
		
		//set the stage
		stage.setTitle("Audio Player");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
