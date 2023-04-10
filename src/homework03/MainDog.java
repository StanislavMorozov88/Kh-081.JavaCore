package homework03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainDog {
    public static void main(String[] args) throws Exception {


        Dog d1 = new Dog("Fibi", "SCHNAUZER", 1);
        Dog d2 = new Dog("Lord", "DOBERMAN", 3);
        Dog d3 = new Dog("Lucky", "DACHSHUND", 7);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a dog breed and get the name: ");
        String code = br.readLine();

        switch (DogBreed.valueOf(code)) {
            case SCHNAUZER:
                System.out.println(d1.getName());
                break;
            case DOBERMAN:
                System.out.println(d2.getName());
                break;
            case DACHSHUND:
                System.out.println(d3.getName());
                break;
            default:
                System.out.println("Server error");
                br.close();
        }

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
