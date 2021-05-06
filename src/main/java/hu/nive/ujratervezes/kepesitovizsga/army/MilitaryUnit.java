package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean armored;
    private String unitName;
    private boolean firstAttack = true;
    private boolean shieldIsIntact = true;

    public int getHitPoints() {
        return hitPoints;
    }

    public String getUnitName() {
        return unitName;
    }

    public MilitaryUnit(int hitPoints, int damage, boolean armored, String unitName) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.armored = armored;
        this.unitName = unitName;
    }

    public int doDamage() {
        if (unitName.equals("Heavy Cavalry") && firstAttack) {
            firstAttack = false;
            return 3 * damage;
        }
        return damage;
    }

    public void sufferDamage(int damage) {
        if (unitName.equals("Swordsman") && shieldIsIntact) {
            shieldIsIntact = false;
            return;
        }
        if (armored) {
            hitPoints -= damage / 2;
        }
        else {
            hitPoints -= damage;
        }
    }
}
