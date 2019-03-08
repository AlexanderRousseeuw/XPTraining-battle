package be.cegeka.battle;

public class Axe implements Weapon {

    protected int damage = 3;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int enableBonusDamage() {
        return getDamage()+ 3;
    }
}
