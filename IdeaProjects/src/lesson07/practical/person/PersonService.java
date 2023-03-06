package lesson07.practical.person;

import java.util.Arrays;

public class PersonService {
    private Person[] persons;
    private int index;

    public PersonService() {
        persons = new Person[3];
        index = -1;
    }

    public boolean add(Person person) {
        if (index == persons.length - 1) {
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
        persons[++index] = person;
        return true;
    }

    public void personsPrintMethod() {
        checkIndex();
        for (int i = 0; i <= index; i++) {
            persons[i].print();
        }
    }

    public void personsSalaryMethod() {
        checkIndex();
        for (int i = 0; i <= index; i++) {
            if (persons[i] instanceof Staff) {
                ((Staff) persons[i]).salary();
            }
        }
    }

    private void checkIndex() {
        if (index < 0) {
            System.out.println("Person list is empty.");
        }
    }

    public int size() {
        return index + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Persons: ");
        for (int i = 0; i <= index; i++) {
            sb.append(persons[i] + ", ");
        }
        return sb.toString();
    }
}
