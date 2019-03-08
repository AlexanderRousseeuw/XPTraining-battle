package be.cegeka.battle;

import java.util.HashSet;
import java.util.Set;

//TODO soldier kan maar in 1 army zitten

public class Army {

    private Set<Soldier> soldiers = new HashSet<>();
    private IHeadquarters headquarters;

    public Army() {
    }

    public Army(IHeadquarters headquarters) {
        this.headquarters = headquarters;
    }

    public void enlist(Soldier soldier) {
        soldier.setId(headquarters.reportEnlistment(soldier.getName()));
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
