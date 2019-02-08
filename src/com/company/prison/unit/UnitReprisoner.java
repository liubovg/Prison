package com.company.prison.unit;
import com.company.prison.room.Room;

import java.util.ArrayList;

import static com.company.Main.MIN_PRISON_VOLUME;
import static com.company.Main.PRISON_VOLUME;


public class UnitReprisoner extends Unit {

    public UnitReprisoner() {
    }

    @Override
    public void buildRooms() {
        int temp = PRISON_VOLUME/MIN_PRISON_VOLUME;
        setVolume(60*temp);
        while ( temp>0 ) {
            for(int i=0; i<8; i++)
                getRooms().add(new Room(4));
            for(int i=0; i<6; i++)
                getRooms().add(new Room(3));
            for(int i=0; i<5; i++)
                getRooms().add(new Room(2));
            temp--;
        }
    }
}
