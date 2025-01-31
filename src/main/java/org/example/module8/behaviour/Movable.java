package org.example.module8.behaviour;

public interface Movable {
    default void move() {
        System.out.println("movement");
    }
}
