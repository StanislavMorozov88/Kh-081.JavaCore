package pract06;

public abstract class Staff extends Person{
    public abstract double salary();
    public Staff(String name) {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

//    @Override
//    public String print() {
//        System.out.println("I am a ");
//        return "";
//    }

    public Staff() {
    }

}
