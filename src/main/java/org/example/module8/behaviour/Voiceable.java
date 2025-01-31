package org.example.module8.behaviour;

public interface Voiceable {
    default void voice(){
        System.out.println("voice");
    }
}
