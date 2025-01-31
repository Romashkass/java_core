package org.example.module8.behaviour;

public interface Starvable {
    default void isHungry() {
        System.out.println("not hungry");
    }
}
