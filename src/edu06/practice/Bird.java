package edu06.practice;
public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }

    public abstract void fly();
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying bird is flying");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying bird is not able to fly");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    public void soar() {
        System.out.println("Eagle is soaring high in the sky");
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }
}

class Chicken extends NonFlyingBird {
    public Chicken() {
        super(true, true);
    }
}

class BirdsMain {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Chicken();

        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays eggs: " + bird.laysEggs());
            System.out.println();
        }
    }
}