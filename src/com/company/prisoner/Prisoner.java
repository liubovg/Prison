package com.company.prisoner;

import java.util.ArrayList;

public class Prisoner {
    private int id;
    private int yearOfBirth;
    private int yearOfArrive;
    private Integer imprisonmentTerm;
    private boolean forward;
    private boolean incurablySick;
    private boolean pedophile;
    private boolean rePrisoned;
    private TypeOfCrime typeOfCrime;

    public Prisoner(int id, int yearOfBirth, int yearOfArrive, Integer imprisonmentTerm, boolean forward, boolean incurablySick, boolean lifeTermed, boolean pedophile, boolean rePrisoned, TypeOfCrime typeOfCrime) {
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        this.yearOfArrive = yearOfArrive;
        this.imprisonmentTerm = imprisonmentTerm;
        this.forward = forward;
        this.incurablySick = incurablySick;
        this.pedophile = pedophile;
        this.rePrisoned = rePrisoned;
        this.typeOfCrime = typeOfCrime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfArrive() {
        return yearOfArrive;
    }

    public void setYearOfArrive(int yearOfArrive) {
        this.yearOfArrive = yearOfArrive;
    }

    public Integer getImprisonmentTerm() {
        return imprisonmentTerm;
    }

    public void setImprisonmentTerm(Integer imprisonmentTerm) {
        this.imprisonmentTerm = imprisonmentTerm;
    }

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }

    public boolean isIncurablySick() {
        return incurablySick;
    }

    public void setIncurablySick(boolean incurablySick) {
        this.incurablySick = incurablySick;
    }

    public boolean isPedophile() {
        return pedophile;
    }

    public void setPedophile(boolean pedophile) {
        this.pedophile = pedophile;
    }

    public boolean isRePrisoned() {
        return rePrisoned;
    }

    public void setRePrisoned(boolean rePrisoned) {
        this.rePrisoned = rePrisoned;
    }

    public TypeOfCrime getTypeOfCrime() {
        return typeOfCrime;
    }

    public void setTypeOfCrime(TypeOfCrime typeOfCrime) {
        this.typeOfCrime = typeOfCrime;
    }


}

