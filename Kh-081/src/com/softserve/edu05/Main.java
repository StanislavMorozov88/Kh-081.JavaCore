package com.softserve.edu05;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] test = {1, 5, 4, 3, 7}; //оголошення та ініціалізація масиву
        System.out.println(test); //спроба виведення нашого масиву в консоль
        System.out.println(Arrays.toString(test)); //виводимо в консоль масив за допомогою методу toString
        Arrays.sort(test, 0, 4); //сортування масиву від 0-го до 4-го
        System.out.println(Arrays.toString(test)); //виводимо результат сортування
        int keyArray = Arrays.binarySearch(test, 8); // пошук keyArray - тобто числа 8 у відсортованому масиві,
        // метод binarySearch видає індекс шуканого елемента
        System.out.println(keyArray); //виводимо в консоль цей індекс
        System.out.println(Arrays.binarySearch(test, 10)); //пробуємо знайти елемент, відсутній у масиві та виводимо результат у консоль
    }
}