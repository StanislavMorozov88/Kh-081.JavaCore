package PracticalTask._7.Task1;

public class Main {
    public static void main(String[] args){

         Animal[] animals = {
                 new Cat("Felix", "Orange"),
                 new Dog("Bark", "Hasky"),
                 new Cat("Maxwell", "Black"),
                 new Dog("Daisy", "Labrador")
         };

         String tempVoice;
         try {
            for (Animal animal: animals){
                tempVoice = animal.getClass().getSimpleName().equalsIgnoreCase("Cat") ? " meows " : " barks ";
                System.out.println(animal.getName() + tempVoice + "for food...");
                animal.voice();

                System.out.println("Feed him!");
                animal.feed();

                System.out.println("Thanks!");
                System.out.println();
            }
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }

    }
}
/*
    Create interface Animal with methods voice() and feed().
    Create two classes Cat and Dog, which implement this interface.
    Create array of Animal and add some Cats and Dogs to it.
    Call voice() and feed() method for all of it
*/
