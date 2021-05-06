package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{


    public static final int HEAVY_CAVALRY_HIT_POINTS_INIT = 150;
    public static final int HEAVY_CAVALRY_DAMAGE_INIT = 20;
    public static final boolean HEAVY_CAVALRY_ARMORED = true;
    public static final String UNIT_NAME = "Heavy Cavalry";

    public HeavyCavalry() {
        super(HEAVY_CAVALRY_HIT_POINTS_INIT, HEAVY_CAVALRY_DAMAGE_INIT, HEAVY_CAVALRY_ARMORED, UNIT_NAME);
    }
}
