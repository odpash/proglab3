package com.proglab3.place;

import com.proglab3.entity.Entity;

public class Roof extends Place {

    public Roof() {}

    public Roof(Entity entity) {
        this();
        setOwner(entity);
    }

    @Override
    public String getName() {
        return "крыша";
    }
}
