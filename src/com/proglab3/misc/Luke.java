package com.proglab3.misc;

import com.proglab3.place.Floor;

public class Luke {
    private boolean exists = true;
    private boolean opened = false;
    private Coda coda;

    public Luke() {
        coda = new Coda();
    }
    public void create() {
        exists = true;
    }
    public void delete() {
        exists = false;
    }

    public void open() {
        opened = true;
    }

    public void close() {
        opened = false;
    }


    public String getOpennedInfo() {
        if (opened) return "открыто";
        else return "закрыто";
    }

    public String getExistsInfo() {
        if (exists) return "существует";
        else return "не существует";
    }

    public String getSourceElementName() {
        return coda.getName();
    }

    public String getName() {
        return "Люк";
    }
}
