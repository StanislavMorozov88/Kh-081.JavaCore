package Homework._4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        float f1 = sc.nextFloat(), f2 = sc.nextFloat(), f3 = sc.nextFloat();
        boolean belongToRange = f1>=-5 && f2>=-5 && f3>=-5 && f1<=5 && f2<=5 && f3<=5;
        System.out.println("Is all floats belong [-5, 5]?\n" + belongToRange);

        //нехочу массиви і цикли це круто, але у нас тема не про це, тому буде така діч))0)
        System.out.println("Enter three integers:");
        int i1 = sc.nextInt(), i2 = sc.nextInt(), i3 = sc.nextInt();
        int maxInt=0, minInt=0;
        if (i1==i2&& i1==i3 && i2 == i3){
            maxInt = i1;
            minInt = i1;
        }
        else if(i1>=i2 && i1>i3){
            maxInt = i1;
            minInt = i2<i3 ? i2 : i3;
        }else if(i2>i1 && i2>=i3){
            maxInt = i2;
            minInt = i1<i3 ? i1 : i3;
        }else if (i1>=i3 && i3>i2){
            maxInt = i3;
            minInt = i1<i2 ? i1 : i2;
        }
        System.out.println("The largest number is "+maxInt);
        System.out.println("The smallest number is "+minInt);

        System.out.println("Enter error number:");
        while (true) {
            try {
                System.out.println("Error type: " + HTTPError.getError(sc.nextInt()).getName());
                break;
            } catch (Exception e) {
                System.out.println("Try again!");
            }
        }
        sc.close();
//        //діч через Optional, працює прікольно, але ще рано
//        int err = 404;
//        Optional<HTTPErrorByOptional> error = HTTPErrorByOptional.get(err);
//        System.out.println(error.get().getName());
    }
}
