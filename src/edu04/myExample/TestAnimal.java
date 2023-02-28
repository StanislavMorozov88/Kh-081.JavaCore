package edu04.myExample;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.FROG;
        switch  (animal){
            case CAT -> System.out.println("Meow!");
            case DOG -> System.out.println("Bow-wow!");
            case FROG -> System.out.println("Ccroak-Сroak!");
            default -> System.out.println("It isn't an animal!");
        }
    }
}
