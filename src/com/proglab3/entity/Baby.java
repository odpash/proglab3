package com.proglab3.entity;

import com.proglab3.place.Place;
import com.proglab3.WordCase;

public class Baby extends Entity {

    public void run(Place place) {
        System.out.print(getName() + " помчался в ");
        if (place.getOwner() == this)
            System.out.println("его " + place.decline(WordCase.ACCUSATIVE));
        else
            System.out.println(place.decline(WordCase.ACCUSATIVE) + " " + place.getOwner().decline(WordCase.GENITIVE));
    }

    public void openWindow() {
        System.out.println(getName() + " распахнул окно");
    }

    public void think(boolean fallingAsleep, Entity about) {
        if (fallingAsleep)
            System.out.print("Ложась спать, ");
        System.out.println(getName() + " думал о " + about.decline(WordCase.PREPOSITIONAL));
    }

    public void cry(boolean covering, boolean loud, String reasonToCry) {
        if (covering)
            System.out.print("Накрывшись одеялом, ");

        System.out.print(getName() + " ");
        if (loud)
            System.out.print("громко плакал");
        else
            System.out.print("тихо плакал");

        if (reasonToCry != null) {
            System.out.print(" от мысли, что ");
            System.out.println(reasonToCry);
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
    public String decline(WordCase wordCase) {
        switch (wordCase) {
            case GENITIVE:
            case ACCUSATIVE:
                return "Малыша";
            case DATIVE:
                return "Малышу";
            case INSTRUMENTAL:
                return "Малышом";
            case PREPOSITIONAL:
                return "Малыше";
            default:
                return getName();
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
