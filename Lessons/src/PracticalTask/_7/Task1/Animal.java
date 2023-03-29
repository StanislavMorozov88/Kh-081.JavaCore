package PracticalTask._7.Task1;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import static java.util.concurrent.TimeUnit.SECONDS;

public interface Animal {

    File catVoice = new File("src\\PracticalTask\\_7\\Task1\\Audio\\Cat.wav");
    File dogVoice = new File("src\\PracticalTask\\_7\\Task1\\Audio\\Dog.wav");
    File feed = new File("src\\PracticalTask\\_7\\Task1\\Audio\\Feed.wav");

    static void playAudio(File file) throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
            //створюєм аудіокліп
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            //рахуєм його довжину
            AudioFormat format = audioStream.getFormat();
            long frames = audioStream.getFrameLength();
            double durationInSeconds = (frames+0.0) / format.getFrameRate();
            if (durationInSeconds < 1){
                durationInSeconds = 1;
            }else if(durationInSeconds > 3){
                durationInSeconds = 3;
            }

            //граєм звук і чекаємо, щоб звук зіграв
            clip.open(audioStream);
            clip.start();
            SECONDS.sleep((int)durationInSeconds);
            clip.close();
    }

    void feed() throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException;
    void voice() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException;
    String getName();
}
