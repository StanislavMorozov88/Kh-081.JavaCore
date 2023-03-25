package edu10.homework;
import java.sql.SQLOutput;
import java.util.*;

// В умові був клас Student та поле курс, я замінив на Worker і department.
// Бо із-за двух однакових класів студентів була помилка.

public class task3 {
    public static void main(String[] args) {
    List<Worker> workers = new ArrayList<>();

    workers.add(new Worker("Ivan", 1));
    workers.add(new Worker("Alisa", 2));
    workers.add(new Worker("Borys", 2));
    workers.add(new Worker("Bohdana",1));
    workers.add(new Worker("Ihor",3));

    Worker.printWorkers(workers,3);
    Worker.printWorkers(workers,2);
    Worker.printWorkers(workers,1);

    System.out.println("---------------");
    System.out.println("Workers sorted by name:");
    Worker.nameComparator(workers);

    System.out.println("---------------");
    System.out.println("Workers sorted by department:");
    Worker.departmentComparator(workers);

    }
}

   class Worker {
    private String name;
    private int department;

    public Worker(String name, int department) {
        this.name = name;
        this.department = department;
    }

       public static void printWorkers(List<Worker> workers, int department){
           Iterator<Worker> iterator = workers.listIterator();
           while (iterator.hasNext()){
               Worker worker = iterator.next();
               if(worker.getDepartment() == department){
                   System.out.println("Department = " + department + ", workers: " + worker.getName());
               }
           }
       }

       public static void nameComparator(List<Worker> workers){
           Collections.sort(workers, new NameWorkersComparator());
           for(Worker worker : workers){
               System.out.println(worker);
           }
       }

       public static void departmentComparator(List<Worker> workers){
           Collections.sort(workers, new DepartmentWorkersComparator());
           for(Worker worker : workers){
               System.out.println(worker);
           }
       }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setCourse(int course) {
        this.department = course;
    }

       @Override
       public String toString() {
           return "Worker{" +
                   "name='" + name + '\'' +
                   ", department=" + department +
                   '}';
       }
}

class NameWorkersComparator implements Comparator<Worker>{
    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.getName().compareTo(w2.getName());
    }
}

class DepartmentWorkersComparator implements Comparator<Worker>{
    @Override
    public int compare(Worker w1, Worker w2) {
        return Integer.compare(w1.getDepartment(), w2.getDepartment());
    }
}

