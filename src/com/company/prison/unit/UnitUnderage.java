package com.company.prison.unit;

import com.company.prison.room.Room;

import static com.company.Main.MIN_PRISON_VOLUME;
import static com.company.Main.PRISON_VOLUME;

public class UnitUnderage extends Unit {
    public UnitUnderage() {
    }
    @Override
    public void buildRooms() {
        int temp = PRISON_VOLUME/MIN_PRISON_VOLUME;
        setVolume(32*temp);
        while (temp>0) {
            for(int i=0; i<4; i++)
                getRooms().add(new Room(4));
            for(int i=0; i<2; i++)
                getRooms().add(new Room(3));
            for(int i=0; i<5; i++)
                getRooms().add(new Room(2));
            temp--;
        }
    }
}
