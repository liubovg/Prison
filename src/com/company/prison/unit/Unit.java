package com.company.prison.unit;

import com.company.prison.room.Room;

import java.util.ArrayList;

public class Unit {
    private int volume;
    private ArrayList<Room> rooms = new ArrayList<Room>();

    public Unit() {
    }

    public void buildRooms(){    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

}
