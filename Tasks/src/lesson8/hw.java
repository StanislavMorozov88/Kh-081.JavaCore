package lesson8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Declare collection myCollection of 10 integers and fill it (from the console or random).
 * Swap the maximum and minimum elements in the list.
 * Insert a random three-digit number before the first negative element of the list
 * Insert a zero between all neighboring elements collection myCollection with different signs
 * Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
 * In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
 * Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
 * Use one or more of the next: List, ArrayList, LinkedList
 */

public class hw {
    public static void main(String[] args) {
        // declare collection
        ArrayList<Integer> myCollection = new ArrayList<>();

        System.out.println("Original list: ");
        fillByRandom(myCollection);
        System.out.println("Swapped list: ");
        swapMinMax(myCollection);
        System.out.println("Insert a random three-digit number before the first negative element: ");
        insertRandomNum(myCollection);
        System.out.println("Insert a zero between all neighboring elements: ");
        insertZero(myCollection);
        System.out.println("Copied list: ");
        copyElements(myCollection);
        System.out.println("My Collection: \n" + myCollection);
        System.out.println("Remove the last even element: ");
        removeLastEven(myCollection);
        System.out.println("Remove from the list myCollection the element following the first minimum:");
        removeFollowMin(myCollection);

    }

    /**
     * Fill list by random numbers
     */
    public static void fillByRandom(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * (20 + 1) - 10));
        }
        System.out.println(list);
    }

    /**
     * Swap the maximum and minimum elements in the list.
     */
    public static void swapMinMax(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        //find min and max num
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        //swap max and min
        Collections.swap(list, list.indexOf(max), list.indexOf(min));
        System.out.println(list);
    }

    /**
     * Insert a random three-digit number before the first negative element of the list
     */
    public static void insertRandomNum(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
             if (list.get(i) < 0) {
                list.add(i, ((int) (Math.random() * (210 + 1) + 100)));
                break;
            }
        }
        System.out.println(list);
    }

    /**
     * Insert a zero between all neighboring elements collection myCollection with different signs
     */
    public static void insertZero(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > 0 && list.get(i + 1) < 0 || list.get(i) < 0 && list.get(i + 1) > 0) {
                list.add(i+1, 0);
            }
        }
        System.out.println(list);
    }

    /**
     * Copy the first k elements of the myCollection to the list1, in direct order,
     * and the rest to the list2 in reverse order.
     */
    public static void copyElements(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int k = list.size() / 2;
        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i >= k) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);
    }

    /**
     * In a list myCollection remove the last even element
     * (if there are even elements in the list).
     * If there is no such element, display a message.
     */
    public static void removeLastEven(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0 && list.get(i)!=0) {
                list.remove(i);
                System.out.println(list);
                break;
            } else if (i == 0 & list.get(i) % 2 != 0) {
                System.out.println("no such element");
            }
        }
    }

    /**
     * Remove from the list myCollection the element following the first minimum.
     * If the minimum element is the last one, nothing needs to be removed.
     */
    public static void removeFollowMin(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0 && i == list.size() - 1) {
                break;
            } else if (list.get(i) < 0) {
                list.remove(i + 1);
                break;
            }
        }
        System.out.println(list);
    }
}
