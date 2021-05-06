package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{


    public static final int ARCHER_HIT_POINTS_INIT = 50;
    public static final int ARCHER_DAMAGE_INIT = 20;
    public static final boolean ARCHER_ARMORED = false;
    public static final String UNIT_NAME = "Archer";

    public Archer() {
        super(ARCHER_HIT_POINTS_INIT, ARCHER_DAMAGE_INIT, ARCHER_ARMORED, UNIT_NAME);
    }
}
