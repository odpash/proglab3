package com.proglab3.place;

import com.proglab3.impl.InstanceChecker;
import com.proglab3.WordCase;

public class School extends Place implements InstanceChecker {

    private boolean exists = true;

    public void burn() {
        exists = false;
    }

    public void extinguish() {
        exists = true;
    }

    @Override
    public boolean exists() {
        return exists;
    }

    @Override
    public void printInstance() {
        System.out.println(exists() ? "Была школа" :
                "Школа сгорела, можно не делать домашку");
    }

    @Override
    public String getName() {
        return "школа";
    }

    @Override
    public String decline(WordCase wordCase) {
        switch (wordCase) {
            case GENITIVE:
                return "школы";
            case ACCUSATIVE:
                return "школу";
            case DATIVE:
            case PREPOSITIONAL:
                return "школе";
            case INSTRUMENTAL:
                return "школой";
            default:
                return getName();
        }
    }

    public class A {
    }
}
