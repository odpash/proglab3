package com.proglab3.entity;

import com.proglab3.impl.Cryable;
import com.proglab3.misc.CryVolume;
import com.proglab3.place.Place;
import com.proglab3.place.Room;

import java.util.Objects;

public class Baby extends Entity implements Cryable {

    private CryVolume cryVolume = CryVolume.QUITE;
    private boolean criesAfterCovering = true;

    public void run(Place place) {
        System.out.print(getName() + " помчался в ");
        if (place.getOwner() == this)
            System.out.println("его " + place.getName());
        else
            System.out.println(place.getName() + " " + place.getOwner().getName());
        setPlace(place);
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

    @Override
    public void cry(String reason) {
        if (criesAfterCovering)
            System.out.println("Накрышись одеялом, ");

        System.out.print(getName() + " ");
        if (cryVolume == CryVolume.LOUD)
            System.out.print("громко плакал");
        else
            System.out.print("тихо плакал");

        if (reason != null) {
            System.out.print(" от мысли, что ");
            System.out.println(reason);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baby baby = (Baby) o;
        return place.equals(baby.place) && cryVolume.equals(baby.cryVolume) &&
                criesAfterCovering == baby.criesAfterCovering;
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, cryVolume, criesAfterCovering);
    }
}
