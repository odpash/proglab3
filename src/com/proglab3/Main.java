package com.proglab3;

import com.proglab3.entity.Baby;
import com.proglab3.entity.Carlson;
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
        baby.openWindow();
        baby.think(true, carlson);

        String reasonToCry = String.format("%s не увидит %s", baby.getName(), carlson.decline(WordCase.ACCUSATIVE));
        baby.cry(true, false, reasonToCry);

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
