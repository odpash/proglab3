package com.proglab3.place;

import com.proglab3.impl.InstanceChecker;

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
}
