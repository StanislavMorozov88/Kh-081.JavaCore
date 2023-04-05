package Homework._9;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(-30, 30));
        }
        ArrayList<Integer> copyOfOriginal = new ArrayList<>(list);

        System.out.println("Swap the maximum and minimum elements in the list:");
        System.out.println(listToColorized(list, getMax(list), getMin(list)));
        swapMaxAndMin(list);
        System.out.println(listToColorized(list, getMax(list), getMin(list)) + "\n");

        list = new ArrayList<>(copyOfOriginal);
        System.out.println("Insert a random three-digit number before the first negative element of the list:");
        System.out.println(list);
        insertBeforeFirstNegative(list, random);
        System.out.println(listToColorized(list, getMax(list)) + "\n");

        list = new ArrayList<>(copyOfOriginal);
        System.out.println("Insert a zero between all neighboring elements collection myCollection with different signs:");
        System.out.println(list);
        insertZero(list);
        System.out.println(listToColorized(list, 0) + "\n");


        list = new ArrayList<>(copyOfOriginal);
        System.out.println("Copy the first k elements of the myCollection to the list1, in direct order, " +
                "\nand the rest to the list2 in reverse order:");
        System.out.println(list);
        int k = 4;
        ArrayList<Integer> list1 = new ArrayList<>(split(list, k)[0]);
        ArrayList<Integer> list2 = new ArrayList<>(split(list, k)[1]);
        System.out.print(listToColorized(list1));
        System.out.println(listToColorized(list2) + "\n");

        list = new ArrayList<>(copyOfOriginal);
        System.out.println("In a list myCollection remove the last even element (if there are even elements in the list). " +
                "\nIf there is no such element, display a message:");
        System.out.println(list);
        removeLastEven(list);
        System.out.println(listToColorized(list) + "\n");

        list = new ArrayList<>(copyOfOriginal);
        System.out.println("Remove from the list myCollection the element following the first minimum. " +
                "\nIf the minimum element is the last one, nothing needs to be removed");
        System.out.println(list);
        removeAfterMin(list);
        System.out.println(listToColorized(list, getMin(list)) + "\n");
    }

    public static void removeAfterMin(List<Integer> list) {
        //Remove from the list myCollection the element following the first minimum.
        //If the minimum element is the last one, nothing needs to be removed.

        int index = list.indexOf(getMin(list));
        if (index == list.size() - 1) {
            return;
        }
        list.remove(index + 1);
    }

    public static void removeLastEven(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            //нуль я рахую парним числом, тому не виключав його
            if (list.get(i) % 2 == 0 /* && list.get(i)!=0 */) {
                list.remove(i);
                return;
            }
        }
        System.out.println("There are no even numbers(");
    }

    public static ArrayList[] split(ArrayList list, int k) {
        //Чому ідейка свариться? мені ж не важливо якого типу прийдуть списки
        //Copy the first k elements of the myCollection to the list1, in direct order,
        //and the rest to the list2 in reverse order
        if (k > list.size()) {
            System.err.println("What? k < list size?? Bruh, imma just copy the list");
            return new ArrayList[]{list};
        }

        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }
        for (int i = list.size() - 1; i >= k; i--) {
            list2.add(list.get(i));
        }

        return new ArrayList[]{list1, list2};
    }

    private static void insertZero(List<Integer> list) {
        //Insert a zero between all neighboring elements collection myCollection with different signs
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                continue;
            }
            index.add(i);
        }
        index.sort(((o1, o2) -> -o1.compareTo(o2)));
        index.forEach(integer -> {
            list.add(integer, 0);
        });
    }

    private static void insertBeforeFirstNegative(List<Integer> list, Random random) {
        if (list.isEmpty()) {
            return;
        }
        //Insert a random three-digit number before the first negative element of the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, random.nextInt(1000, 9999));
                break;
            }
        }
    }

    private static void swapMaxAndMin(List<Integer> list) {
        if (list.isEmpty()) {
            return;
        }
        int max = getMax(list);
        int min = getMin(list);
        //it should work with duplicates
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                list.set(i, min);
            } else if (list.get(i) == min) {
                list.set(i, max);
            }
        }
    }

    private static int getMax(@NotNull List<Integer> list) {
        return list.stream()
                .max(Integer::compareTo)
                .get();
    }

    private static int getMin(@NotNull List<Integer> list) {
        return list.stream()
                .min(Integer::compareTo)
                .get();
    }

    public static String listToColorized(List<Integer> list, int... nums) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        list.forEach(o -> {
            boolean isIt = false;
            for (int num : nums) {
                isIt = o.equals(num) || isIt;
            }
            if (isIt) {
                builder.append("\033[0;36m")
                        .append(o.toString())
                        .append("\033[0m");
            } else {
                builder.append(o);
            }
            builder.append(", ");
        });

        builder.deleteCharAt(builder.length() - 2)
                .deleteCharAt(builder.length() - 1)
                .append("]");

        return builder.toString();
    }

    public static String listToColorized(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        list.forEach(o -> {
            builder.append("\033[0;36m")
                    .append(o.toString())
                    .append("\033[0m")
                    .append(", ");
        });

        builder.deleteCharAt(builder.length() - 2)
                .deleteCharAt(builder.length() - 1)
                .append("]");

        return builder.toString();
    }
}
