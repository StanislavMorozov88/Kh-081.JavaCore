package edu06.homework.task1;

import edu06.homework.task1.*;

public class TestBird {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Black", "1 per day"),
                new Swallow("Black and white", "2 per day"),
                new Penguin("Pink", "3 per day"),
                new Chicken("Yellow", "4 per day")
        };

        for (Bird bird : birds){
            System.out.println(bird);
        }

        System.out.println("-----------");
        for (int i = 0; i < birds.length; i++){
            birds[i].fly();
        }
    }
}
