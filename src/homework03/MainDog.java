package homework03;

public class MainDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Fibi", "SCHNAUZER", 1);
        Dog d2 = new Dog("Lord", "DOBERMAN", 3);
        Dog d3 = new Dog("Lucky", "DACHSHUND", 7);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        if (d1.getName().equals(d2.getName()) || (d3.getName().equals(d1.getName()))) {
            System.out.println("There are the same names of dogs");
        }
        else {
            System.out.println("All dogs have different names");
        }

        int OldestDog = Math.max(d2.getAge(), Math.max(d2.getAge(), d3.getAge()));
        System.out.println("The oldest dog is " + OldestDog + " years old");
        }


}
