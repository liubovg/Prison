package com.company.prison.unit;

import com.company.prison.room.Room;

import java.util.ArrayList;

import static com.company.Main.MIN_PRISON_VOLUME;
import static com.company.Main.PRISON_VOLUME;

public class UnitMedical extends Unit implements Cleanable{
    public UnitMedical() {
    }

    @Override
    public void clean() {
        System.out.println("Medical : Clean!");
    }

    @Override
    public void buildRooms() {
        int temp = PRISON_VOLUME/MIN_PRISON_VOLUME;
        setVolume(6*temp);
        while (temp>0) {
            for(int i=0; i<6; i++)
                getRooms().add(new Room(1));
            temp--;
        }
    }
}
