package com.proglab3.entity;

import com.proglab3.impl.InstanceChecker;
import com.proglab3.place.Roof;

import java.util.Objects;

public class Carlson extends Entity implements InstanceChecker {

    @Override
    public boolean canFly() {
        return true;
    }

    private boolean isOnBabysRoof(){
        return getPlace() instanceof Roof && getPlace().getOwner() instanceof Baby;
    }

    @Override
    public boolean exists() {
        return isOnBabysRoof();
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
        return place.equals(carlson.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place);
    }
}
