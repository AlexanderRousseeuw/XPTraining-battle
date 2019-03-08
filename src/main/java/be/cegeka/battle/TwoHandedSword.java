package be.cegeka.battle;

public class TwoHandedSword implements Weapon {
    @Override
    public int getDamage() {
        return 5;
    }

    @Override
    public int enableBonusDamage() {
        return 0;
    }
}
