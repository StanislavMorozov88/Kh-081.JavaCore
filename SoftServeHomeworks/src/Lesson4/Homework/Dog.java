package Lesson4.Homework;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public static void main(String[] args) {
        if(Breed.AKITA.getName().equals(Breed.BOXER.getName()) && Breed.AKITA.getName().equals(Breed.LABRADOR.getName()) && Breed.BOXER.getName().equals(Breed.LABRADOR.getName())){
            System.out.println("There isn't any dogs with the same name");
        }else {
            System.out.println("You have dogs with the same name");
        }
        int[] array = new int[]{Breed.BOXER.getAge(), Breed.LABRADOR.getAge(), Breed.AKITA.getAge()};
        int maxAge = 0;
        for (int i = 0; i < array.length; i++) {
            if(maxAge <= array[i]){
                maxAge = array[i];
            }
        }
        System.out.println();
        if(maxAge == Breed.AKITA.getAge()){
            System.out.println("Akita is the oldest dog");
        }else if(maxAge == Breed.BOXER.getAge()) {
            System.out.println("Boxer is the oldest dog");
        }
        else if (maxAge == Breed.BOXER.getAge()) {
            System.out.println("Labrador is the oldest dog");

        }
    }

}