package com.proglab3.entity;

import com.proglab3.impl.InstanceChecker;

import java.util.Objects;

public class Carlson extends Entity implements InstanceChecker {

    private boolean isAway = true;

    @Override
    public boolean canFly() {
        return true;
    }

    public void flyAway() {
        isAway = true;
    }

    public void comeBack() {
        isAway = false;
    }

    @Override
    public boolean exists() {
        return !isAway;
    }

    @Override
    public void printInstance() {
        if (exists())
            System.out.println("Карлсон есть!");
        else
            System.out.println("Карлсона не было и не было...");
    }

    @Override
    public String getName() {
        return "Карлсон";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carlson carlson = (Carlson) o;
        return isAway == carlson.isAway;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAway);
    }
}
