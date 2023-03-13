package Lesson8.PracticalTasks;

public class Department implements Cloneable {
    private String name;
    private Adress adress;

    @Override
    protected Department clone() throws CloneNotSupportedException {
        return (Department) super.clone();
    }
    public Department(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }

    static class Adress implements Cloneable {
        private String city;
        private String street;
        private int building;

        @Override
        protected Adress clone() throws CloneNotSupportedException {
            return (Adress) super.clone();
        }

        public Adress() {
        }

        public Adress(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "Adress{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }
}
