package com.proglab3;

import com.proglab3.entity.Baby;
import com.proglab3.entity.Carlson;
import com.proglab3.impl.ReasonToCry;
import com.proglab3.misc.Days;
import com.proglab3.misc.Lessons;
import com.proglab3.place.Room;
import com.proglab3.place.School;

public class Main {

    public static void main(String[] args) {
        runIncredibleStory();
    }

    private static void runIncredibleStory() {
        Baby baby = new Baby();
        Carlson carlson = new Carlson();
        carlson.flyAway();
        Room room = new Room(baby);
        //room.setOwner(carlson);
        baby.run(room);

        if (!room.getWindow().isOpened())
            baby.openWindowInRoom(room);
        baby.think(true, carlson);

        baby.cry(true, false, new ReasonToCry() {
            @Override
            public String reasonToCry() {
                return String.format("%s больше не увидит %s", baby.getName(), carlson.getName());
            }
        });

        School school = new School();
        Lessons lessons = new Lessons();

        Days.go();
        // school.burn();
        school.printInstance();
        // lessons.cancel();
        lessons.printInstance();
        carlson.printInstance();
    }
}
