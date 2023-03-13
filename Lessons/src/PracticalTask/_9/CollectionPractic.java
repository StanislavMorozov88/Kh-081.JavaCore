package PracticalTask._9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionPractic {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random(1984);
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
        //під яким номером після видалення наш наступний об'єкт в листі
        for (Integer integer: positionsOfBiggerThan20) {
            myCollection.remove((int)integer);
        }
        System.out.println("myCollection without numbers bigger than 20: " + myCollection);

//        Потім дороблю, йду спати...

//        try{
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }


    }
}
