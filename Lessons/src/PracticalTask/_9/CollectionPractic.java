package PracticalTask._9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CollectionPractic {
    public static void main(String[] args) {


        //тут я ще не знав про стріми, тому таке, робив шо перше в голову прийшло...
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<10; i++){
            myCollection.add(random.nextInt(-30, 30));
        }
        System.out.println("myCollection: " + myCollection);

        //Знаходим індекси де >5 і >20
        List<Integer> newCollection = new ArrayList<>();
        List<Integer> positionsOfBiggerThan20 = new ArrayList<>();

        int index = 0;
        //indexOf() некоректний з дублікатами (наприклад маємо ..., 4, 1, 1, 3, ...
        //тоді він видасть позицію першого "4"
        for (int num: myCollection){
            if(num>20){
                //щоб потім не розвертати вираз, кожен раз додаю на 0-ву позицію
                positionsOfBiggerThan20.add(0, index);
            }
            if(num>5){
                newCollection.add(index);
            }
            index++;
        }
        System.out.println("Index of numbers bigger than 5: " + newCollection);

        //Проходимось по листу з позиціями чисел >20 та видаляємо їх
        //Оскільки у нас позиції ідуть у порядку спадання, то можна не паритись з тим,
        //під яким номером після видалення наш наступний об'єкт в листi
        for (Integer integer: positionsOfBiggerThan20) {
            myCollection.remove((int)integer);
        }
        System.out.println("myCollection without numbers bigger than 20: " + myCollection);

        try {
            myCollection.add(2, 1);
            myCollection.add(5, -4);
            myCollection.add(8, -3);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println("myCollection after insertions: " + myCollection);

        myCollection.sort((o1, o2) -> -o1.compareTo(o2));

        System.out.println("Sorted list \"myCollection\": " + myCollection);
    }
}
