package com.proglab3.misc;

public class Coda {
    private boolean exists = true;

    public void create() {
        exists = true;
    }
    public void delete() {
        exists = false;
    }

    public String getExistsInfo() {
        if (exists) return "существует";
        else return "не существует";
    }


    public String getName() {
        return "Кода";
    }
}
