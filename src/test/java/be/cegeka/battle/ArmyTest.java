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

    @Test
    public void armyCanFightArmy() {
        Army army = new Army();
        Army army2 = new Army();
        Assertions.assertThat(army.fight(army2)).isInstanceOf(Army.class);
    }

    @Test
    public void strongestArmyWins() {
        Army army = new Army();
        Soldier soldier = new Soldier("Jef", new Axe());
        army.enlist(soldier);

        Army army2 = new Army();
        Soldier soldier2 = new Soldier("Jef", new BareFist());
        army2.enlist(soldier2);

        Assertions.assertThat(army.fight(army2)).isEqualTo(army);

    }

    @Test
    public void weakestArmyLoses() {
        Army army = new Army();
        Soldier soldier = new Soldier("Jef", new Axe());
        army.enlist(soldier);

        Army army2 = new Army();
        Soldier soldier2 = new Soldier("Jef", new BareFist());
        Soldier soldier3 = new Soldier("Jef", new BareFist());
        Soldier soldier4 = new Soldier("Jef", new BareFist());
        Soldier soldier5 = new Soldier("Jef", new BareFist());
        army2.enlist(soldier2);
        army2.enlist(soldier3);
        army2.enlist(soldier4);
        army2.enlist(soldier5);

        Assertions.assertThat(army.fight(army2)).isEqualTo(army);

    }
}
