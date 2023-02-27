import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number error");
        int whatTheError =scanner.nextInt();
        if (whatTheError==100 ||whatTheError==101||whatTheError==102||whatTheError==103){
            System.out.println(WhatTheError.INFO);
        }
        if (whatTheError==200 ||whatTheError==201||whatTheError==202){
            System.out.println(WhatTheError.SUCCESS);
        }
        if (whatTheError==300 ||whatTheError==301||whatTheError==302){
            System.out.println(WhatTheError.REDIRECTION);
        }
        if (whatTheError==400 ||whatTheError==401||whatTheError==402){
            System.out.println(WhatTheError.CLIENTERROR);
        }

    }



}
