package Lesson6.Homework;

public class Hw1 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Chicken();
        birds[1] = new Penguin();
        birds[2] =new Eagle();
        birds[3] = new Swallow();


        for (int i = 0; i < birds.length; i++) {
            birds[i].fly();
        }

        System.out.println();
        birds[0].setFeathers("White");
        birds[1].setFeathers("Black-white");
        birds[2].setFeathers("Brown");
        birds[3].setFeathers("Yellow");

        birds[0].setLayEggs(10);
        birds[1].setLayEggs(2);
        birds[2].setLayEggs(3);
        birds[3].setLayEggs(4);

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
            System.out.println("My feathers are " + birds[i].getFeathers());
            System.out.println("I have " + birds[i].getLayEggs() + " eggs");
            System.out.println();
        }
    }

}
