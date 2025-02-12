package org.example.module8.animals;

public class Kangaroo extends Animal {
    public Kangaroo() {
        super();
    }

    public Kangaroo(String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    @Override
    public void move() {
        System.out.println("jump-jump");
    }

    @Override
    public void isHungry() {
        System.out.println("I want berries");
    }

    @Override
    public void voice() {
        System.out.println("khe-khe");
    }
}
