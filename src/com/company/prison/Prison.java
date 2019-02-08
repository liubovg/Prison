package com.company.prison;

import com.company.prison.unit.Unit;
import com.company.prisoner.Prisoner;

import java.util.ArrayList;



public class Prison {

    private int prisonVolume;

    private ArrayList<Unit> units = new ArrayList<>();
    private ArrayList<Prisoner> prisoners = new ArrayList<>();


    public Prison addUnit(Unit u){
        units.add(u);
        return this;
    }

    public Prison addPrisoner(Prisoner p){
        prisoners.add(p);
        return this;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    /*public ArrayList<Unit> createUnits(int quantityOfPrisoners){

        units.add()

    }*/

    public int getPrisonVolume() {
        return prisonVolume;
    }

    public void setPrisonVolume(int prisonVolume) {
        this.prisonVolume = prisonVolume;
    }
}
