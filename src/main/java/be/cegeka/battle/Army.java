package be.cegeka.battle;

import java.util.HashSet;
import java.util.Set;

//TODO soldier kan maar in 1 army zitten

public class Army {

    private Set<Soldier> soldiers = new HashSet<>();

    public void enlist(Soldier soldier) {
        this.soldiers.add(soldier);
    }

    public Set<Soldier> getSoldiers() {
        return this.soldiers;
    }

    public Army fight(Army army) {

        while (this.getSoldiers().size() > 0 && army.getSoldiers().size() > 0) {

            Soldier thisSoldier = this.getSoldiers().stream().findFirst().get();
            Soldier otherSoldier = army.getSoldiers().stream().findFirst().get();
            Soldier winner = thisSoldier.fight(otherSoldier);

            if (winner.equals(thisSoldier)) {
                army.getSoldiers().remove(otherSoldier);
            } else this.getSoldiers().remove(thisSoldier);
        }

        if (this.getSoldiers().size() == 0) {
            return army;
        }

        return this;
    }
}
