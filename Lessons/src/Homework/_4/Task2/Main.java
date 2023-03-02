package Homework._4.Task2;

public class Main {

    //не робив трай-кетч, тому най мейн теж плюється помилками, у а шо, так і живем, перекидаєм обов'язки на інших чи на завтрашнє "я"...
    public static void main(String[] args) throws Exception{

        Dog d1 = new Dog("kalO", Dog.Breed.Poodle, 1);
        Dog d2 = new Dog("Kalo", Dog.Breed.Borzoi, 2);
        Dog d3 = new Dog("Hatiko", Dog.Breed.Labrador, 3);

        if (d1.getName().equalsIgnoreCase(d2.getName()) ||
            d2.getName().equalsIgnoreCase(d3.getName()) ||
            d1.getName().equalsIgnoreCase(d3.getName()) ){
                System.out.println("There is two dogs with the same name.");
        }else {
            System.out.println("There is no dogs with the same name.");
        }

        int maxAge =0;
        String oldestDogName = null;
        String oldestDogKind = null;
        if (d1.getAge() >= d2.getAge() && d1.getAge() >= d3.getAge() ){
            maxAge = d1.getAge();
            oldestDogName = d1.getName();
            oldestDogKind = d1.getBreed();
        } else if (d2.getAge() > d1.getAge() && d2.getAge() >= d3.getAge() ) {
            maxAge = d2.getAge();
            oldestDogName = d2.getName();
            oldestDogKind = d2.getBreed();
        }else if (d3.getAge() > d1.getAge() && d3.getAge() > d2.getAge() ) {
            maxAge = d3.getAge();
            oldestDogName = d3.getName();
            oldestDogKind = d3.getBreed();
        }else{
            System.err.println("There is something wrong(");
            throw new Exception("Error in process of getting max age");
        }

        System.out.println("The oldest dog is " + oldestDogKind.toLowerCase() + " named "+ oldestDogName + " in age "+ maxAge + " years.");

    }
}
