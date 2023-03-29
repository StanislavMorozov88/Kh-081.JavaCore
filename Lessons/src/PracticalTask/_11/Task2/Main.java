package PracticalTask._11.Task2;

import PracticalTask._11.Task2.Exceptions.ColorException;
import PracticalTask._11.Task2.Exceptions.TypeException;

public class Main {
    public static void main(String[] args) {
        try {
            Plant pl = new Plant("rose", "blue", 5);
            System.out.println(pl);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }
    }

}
