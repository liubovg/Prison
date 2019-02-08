package com.company;

import com.company.prison.Prison;
import com.company.prison.unit.Cleanable;
import com.company.prison.unit.Unit;
import com.company.prison.unit.UnitMedical;
import com.company.prison.unit.UnitReprisoner;


public class Main {

    public static final int MIN_PRISON_VOLUME = 200;
    public static final int PRISON_VOLUME = 200;
    public static void main(String[] args) {

        Prison p= new Prison();
        p
                .addUnit(new UnitMedical())
                .addUnit(new UnitReprisoner())
                .addUnit(new Unit());

        for (Unit u:
             p.getUnits()) {
            u.buildRooms();
            if(u instanceof Cleanable)
            {
                System.out.println(u.getVolume());
                Cleanable clean=(Cleanable)u;
                clean.clean();
            }
        }


    }
}
