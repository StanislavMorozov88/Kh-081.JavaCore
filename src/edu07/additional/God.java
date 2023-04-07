package edu07.additional;

public class God {
    public static Human[] create(){
        Man adam = new Man("Adam");
        Woman eve = new Woman("Eve");
        return new Human[]{adam, eve};
    }
}
class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Man extends Human {
    public Man(String name) {
        super(name);
    }
}

class Woman extends Human {
    public Woman(String name) {
        super(name);
    }
}
class Main{
    public static void main(String[] args) {
        Human[] humans = God.create();
        for (Human human : humans) {
            System.out.println(human);
        }
    }
}