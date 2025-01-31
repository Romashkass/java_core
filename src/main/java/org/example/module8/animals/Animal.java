package org.example.module8.animals;

import org.example.module8.behaviour.Movable;
import org.example.module8.behaviour.Starvable;
import org.example.module8.behaviour.Voiceable;

public abstract class Animal implements Voiceable, Movable, Starvable {
    private String name;
    private int footNumber;
    private boolean hasMustache;

    public Animal() {
        this.name = "unknown";
        this.footNumber = -1;
        this.hasMustache = false;
    }

    public Animal(String name, int footNumber, boolean hasMustache) {
        this.name = name;
        this.footNumber = footNumber;
        this.hasMustache = hasMustache;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(int footNumber) {
        this.footNumber = footNumber;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
