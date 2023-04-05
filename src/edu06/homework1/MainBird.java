package edu06.homework1;

public class MainBird {
    public static void main(String[] args) {
        Bird[] birds = {
                new Chicken("often brown", "very often"),
                new Eagle("white or brown", "once a year"),
                new Swallow("dark", "once a year"),
                new Penguin("black with white stomach", "once a year")


        };
        for(Bird bird: birds){
            System.out.println(bird.getClass() + " : " );
            bird.fly();
            bird.info();
            System.out.println();
        }

    }

}
