package be.cegeka.battle;

public class MagicPotion {
    public int getDamage(int opponentsDamage) {
        if (opponentsDamage % 2 == 0) {
            return 10;
        }
        return 0;
    }
}
