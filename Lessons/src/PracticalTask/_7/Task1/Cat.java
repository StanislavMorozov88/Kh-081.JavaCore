package PracticalTask._7.Task1;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Objects;

public class Cat implements Animal{
    String name;
    String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void feed() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        Animal.playAudio(Animal.feed);
    }

    public void voice() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        Animal.playAudio(Animal.catVoice);
    }



    //Nevermind
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

