package com.proglab3.entity;

import com.proglab3.place.Place;

public abstract class Entity {
    protected Place place = null;

    public abstract String getName();

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
