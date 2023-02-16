package home_tasks;

import java.util.Scanner;

public class Calls {

    private static double  readCostInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter call's cost:");
        while (true) {
            try {
                double callsCost= input.nextDouble();
                if (callsCost<=0){
                    System.out.println("Cost per unit must be greater than zero");
                } else {
                    return callsCost;
                }
            }
            catch (java.util.InputMismatchException e) {
                System.err.println("It's not a valid cost");
                input.nextLine();
            }
        }
    }

    private static int readMinutesInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes:");
        while (true) {
            try {
                int minutes = input.nextInt();
                if (minutes<0){
                    System.out.println("Minutes must be greater than or equals to 0");
                } else {
                    return minutes;
                }
            }
            catch (java.util.InputMismatchException e) {
                System.err.println("It's not a valid minutes value");
                input.nextLine();
            }
        }
    }

    public static double calculateCost(double cost, int minutes){
        return cost * minutes;
    }

    public static void printCostInfo(double costForCall){
        System.out.println("Cost for call is " + costForCall);
        System.out.println();
    }

    public static void totalCostInfo(double totalCost){
        System.out.println("Total cost for all calls is " + totalCost);
    }

    public static void main(String[] args) {
        double totalCost = 0;
        for (int i = 0;i<3;i++){
            double costForCall = calculateCost(readCostInfo(),readMinutesInfo());
            printCostInfo(costForCall);
            totalCost +=costForCall;
        }
        totalCostInfo(totalCost);
    }
}
