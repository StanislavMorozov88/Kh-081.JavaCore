package edu06.homework.task2;

import java.util.Arrays;

public class TestReport {
    public static void main(String[] args)  {
        Worker[] workers = {
                new Worker("Mykola", 25, 1000),
                new Developer("Maryna", 30, "Average Java developer", 1500),
                new Worker("Taras", 35, 1200),
                new Developer("Olena", 30, "Senior Designer", 2000)
        };

        for (Worker worker : workers){
            System.out.println(worker);
        }

        System.out.println("----------");
        for (int i = 0; i < workers.length; i++){
            workers[i].report();
        }

    }
}
