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
    }  //якщо чесно, я не зрозуміла, для чого ця константа і що з нею робити далі

    public Teacher(String name) {
        super(name);
    }

    public Teacher() {
    }

}
