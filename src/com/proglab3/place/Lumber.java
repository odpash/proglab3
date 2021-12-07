package com.proglab3.place;

import com.proglab3.misc.Hole;

public class Lumber extends Place {
    private Hole hole;

    public Lumber() {
        hole = new Hole();
    }

    public String isObjExists() {
        return hole.getExistsInfo();
    }


    public String getObjName() {
        return hole.getName();
    }



    @Override
    public String getName() {
        return "Чулан";
    }
}
