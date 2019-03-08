package be.cegeka.battle;

public class BroadAxe extends Axe {
    @Override
    public int getDamage() {
        return 2 + damage;
    }
}
