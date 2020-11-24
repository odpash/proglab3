package com.proglab3.entity;

import com.proglab3.impl.InstanceChecker;
import com.proglab3.WordCase;

public class Carlson extends Entity implements InstanceChecker {

    private boolean isHere = true;

    @Override
    public boolean canFly() {
        return true;
    }

    public void flyAway() {
        isHere = false;
    }

    public void comeBack() {
        isHere = true;
    }

    @Override
    public boolean exists() {
        return isHere;
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
    public String decline(WordCase wordCase) {
        switch (wordCase) {
            case GENITIVE:
            case ACCUSATIVE:
                return "Карлсона";
            case DATIVE:
                return "Карлсону";
            case INSTRUMENTAL:
                return "Карлсоном";
            case PREPOSITIONAL:
                return "Карлсоне";
            default:
                return getName();
        }
    }

    @Override
    public String toString() {
        return "Carlson{" +
                "isHere=" + isHere +
                '}';
    }
}
