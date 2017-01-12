package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

/**
 * Created by messadene on 12/01/17.
 */
public class EmetteurSonoreImpl implements EmetteurSonore {



    public EmetteurSonoreImpl() {
    }

    @Override
    public void emettreClic() {
        new Thread(() -> {
            String bip="bip.wav";
            Media media = new Media(Paths.get(bip).toUri().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        }).start();
    }

}
