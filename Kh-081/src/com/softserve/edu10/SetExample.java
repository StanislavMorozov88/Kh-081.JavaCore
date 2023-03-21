package com.softserve.edu10;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
  
  // Приклад статичного методу, який повертає об'єднання двох множин
  public static Set<String> union(Set<String> set1, Set<String> set2) {

    Set<String> union = new HashSet<>(set1);
    union.addAll(set2);
    return union;
  }
  
  // Приклад нестатичного методу, який додає елемент до множини
  public void addElement(Set<String> set, String element) {
    set.add(element);
  }

  public static void main(String[] args) {
    // Створюємо дві множини
    Set<String> set1 = new HashSet<>();
    set1.add("apple");
    set1.add("banana");
    
    Set<String> set2 = new HashSet<>();
    set2.add("banana");
    set2.add("orange");
    
    // Викликаємо статичний метод для об'єднання множин
    Set<String> unionSet = SetExample.union(set1, set2);
    System.out.println("Union set: " + unionSet);
    
    // Створюємо об'єкт класу SetExample
    SetExample setExample = new SetExample();
    
    // Викликаємо нестатичний метод для додавання елемента до множини
    setExample.addElement(set1, "orange");
    System.out.println("Set 1 after adding element: " + set1);
  }
}