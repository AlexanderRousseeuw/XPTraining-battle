package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArmyTest {

    @Test
    public void canEnrollSoldierToArmy() {
        Army army = new Army();
        Soldier soldier = new Soldier("Jef");
        army.enlist(soldier);
        Assertions.assertThat(army.getSoldiers()).contains(soldier);
    }
}
