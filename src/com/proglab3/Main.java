package com.proglab3;

import com.proglab3.entity.Baby;
import com.proglab3.entity.Carlson;
import com.proglab3.misc.Lessons;
import com.proglab3.place.Roof;
import com.proglab3.place.Room;
import com.proglab3.place.School;

public class Main {

    public static void main(String[] args) {
        runIncredibleStory();
    }

    private static void runIncredibleStory() {
        Baby baby = new Baby();
        Roof roof = new Roof(baby);

        Carlson carlson = new Carlson();
        //carlson.setPlace(roof);
        
        Room room = new Room(baby);
        baby.run(room);

        if (!room.getWindow().isOpened())
            baby.openWindowInRoom(room);
        baby.think(true, carlson);

        if (!carlson.exists())
            baby.cry(String.format("%s больше не увидит %s", baby.getName(), carlson.getName()));

        School school = new School();
        Lessons lessons = new Lessons();

        school.printInstance();
        lessons.printInstance();
        carlson.printInstance();
    }
}
