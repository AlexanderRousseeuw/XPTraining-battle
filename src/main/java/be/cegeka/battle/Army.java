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
}
