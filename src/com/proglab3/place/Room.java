package com.proglab3.place;

import com.proglab3.WordCase;
import com.proglab3.entity.Entity;

public class Room extends Place {

    public Room() {
    }

    public Room(Entity owner) {
        setOwner(owner);
    }

    @Override
    public String getName() {
        return "комната";
    }

    @Override
    public String decline(WordCase wordCase) {
        switch (wordCase) {
            case GENITIVE:
                return "комнаты";
            case ACCUSATIVE:
                return "комнату";
            case DATIVE:
            case PREPOSITIONAL:
                return "комнате";
            case INSTRUMENTAL:
                return "комнатой";
            default:
                return getName();
        }
    }
}
