package Homework._3;


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Amber", "Freeman");
        p1.setBrithYear(2004);
        Person p2 = new Person("Eula", "Nobless");
        p2.setBrithYear(2000);
        Person p3 = new Person();
        p3.changeName("Keya", "Khaenrya");
        p3.setBrithYear(1998);
        Person p4 = new Person();
        p4.changeName("Zhong", "Li");
        p4.setBrithYear(-4000);
        Person p5 = new Person();
        //Can`t create methods that change firstname or firs and last names...
        //How to create methods that change only lastname??? How do they know???
        p5.changeName("Hu");
        p5.changeName("", "Tao");
        p5.setBrithYear(2002);

        p4.input();
        p4.output();
    }
}
