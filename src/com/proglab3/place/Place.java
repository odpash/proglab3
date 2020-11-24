package com.proglab3.place;

import com.proglab3.impl.Declinable;
import com.proglab3.entity.Entity;

public abstract class Place implements Declinable {
    protected Entity owner;

    public Entity getOwner() {
        return owner;
    }

    public void setOwner(Entity owner) {
        this.owner = owner;
    }

    public abstract String getName();
}
