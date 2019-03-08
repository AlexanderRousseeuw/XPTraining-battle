package be.cegeka.battle;

public class Sword implements Weapon {

    protected int damage = 2;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int enableBonusDamage() {
        return getDamage() + 3;
    }
}
