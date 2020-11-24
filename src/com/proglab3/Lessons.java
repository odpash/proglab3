package com.proglab3;

import com.proglab3.impl.InstanceChecker;

public class Lessons implements InstanceChecker {

    private boolean exists = true;

    public void cancel() {
        exists = false;
    }

    public void set() {
        exists = true;
    }

    @Override
    public boolean exists() {
        return exists;
    }

    @Override
    public void printInstance() {
        System.out.println(exists() ? "Были уроки" :
                "Уроков не было! Теперь малыш мог плакать целый день!");
    }
}
