package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    public static final int MIN_HIT_POINTS = 25;
    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> removeMU = new ArrayList<>();
        for (MilitaryUnit mu: militaryUnits) {
            mu.sufferDamage(damage);
            if (mu.getHitPoints() < MIN_HIT_POINTS) {
                removeMU.add(mu);
            }
        }
        militaryUnits.removeAll(removeMU);
    }

    public int getArmyDamage() {
        int sumDamage = 0;
        for (MilitaryUnit mu: militaryUnits) {
            sumDamage += mu.doDamage();
        }
        return sumDamage;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}
