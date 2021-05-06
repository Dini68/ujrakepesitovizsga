package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    public static final int SWORDSMAN_HIT_POINTS_INIT = 100;
    public static final int SWORDSMAN_DAMAGE_INIT = 10;
    public static final String UNIT_NAME = "Swordsman";

    public Swordsman(boolean armored) {
        super(SWORDSMAN_HIT_POINTS_INIT, SWORDSMAN_DAMAGE_INIT,
                armored, UNIT_NAME);
    }
}

