package pract06;

class Teacher extends Staff{

    @Override
    public String print() {
        System.out.println("I am a ");
        return "";
    }

    @Override
    public double salary() {
        return 0;
    }
    public final void TypePerson(){
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher() {
    }

}
