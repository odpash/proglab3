package com.proglab3;


import com.proglab3.entity.Homsa;
import com.proglab3.entity.Misa;
import com.proglab3.place.Corner;

public class Main {

    public static void main(String[] args) {
        runIncredibleStory();
    }

    private static void runIncredibleStory() {
        Misa misa = new Misa();
        Corner corner = new Corner();
        misa.getDressed();
        misa.setPlace(corner);
        misa.cornerCry();
        Homsa homsa = new Homsa();
        homsa.tryPerfomance();
    }
}
