package com.proglab3.entity;

import com.proglab3.impl.ReasonToCry;
import com.proglab3.place.Place;
import com.proglab3.place.Room;

public class Baby extends Entity {

    public void run(Place place) {
        System.out.print(getName() + " помчался в ");
        if (place.getOwner() == this)
            System.out.println("его " + place.getName());
        else
            System.out.println(place.getName() + " " + place.getOwner().getName());
    }

    public void openWindowInRoom(Room room) {
        room.getWindow().open();
        System.out.println(getName() + " распахнул " + room.getWindow().toString());
    }

    public void think(boolean fallingAsleep, Entity about) {
        if (fallingAsleep)
            System.out.print("Ложась спать, ");
        System.out.println(getName() + " думал о " + about.getName());
    }

    public void cry(boolean covering, boolean loud, ReasonToCry reasonToCry) {
        if (covering)
            System.out.print("Накрывшись одеялом, ");

        System.out.print(getName() + " ");
        if (loud)
            System.out.print("громко плакал");
        else
            System.out.print("тихо плакал");

        if (reasonToCry != null) {
            System.out.print(" от мысли, что ");
            System.out.println(reasonToCry.reasonToCry());
        }
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public String getName() {
        return "Малыш";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
