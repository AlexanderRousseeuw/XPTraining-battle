package be.cegeka.battle;

public class BareFist implements Weapon {
    @Override
    public int getDamage() {
        return 1;
    }

    @Override
    public int enableBonusDamage() {
        return 0;
    }
}
