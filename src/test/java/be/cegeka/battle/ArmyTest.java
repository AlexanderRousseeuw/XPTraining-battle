package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class ArmyTest {

    IHeadquarters headquarters = Mockito.mock(IHeadquarters.class);

    @Test
    public void canEnrollSoldierToArmy() {
        Army army = new Army(headquarters);
        Soldier soldier = new Soldier("Jef");
        army.enlist(soldier);
        Assertions.assertThat(army.getSoldiers()).contains(soldier);
    }

    @Test
    public void armyCanFightArmy() {
        Army army = new Army(headquarters);
        Army army2 = new Army(headquarters);
        Assertions.assertThat(army.fight(army2)).isInstanceOf(Army.class);
    }

    @Test
    public void strongestArmyWins() {
        Army army = new Army(headquarters);
        Soldier soldier = new Soldier("Jef", new Axe());
        army.enlist(soldier);

        Army army2 = new Army(headquarters);
        Soldier soldier2 = new Soldier("Jef", new BareFist());
        army2.enlist(soldier2);

        Assertions.assertThat(army.fight(army2)).isEqualTo(army);

    }

    @Test
    public void weakestArmyLoses() {
        Army army = new Army(headquarters);
        Soldier soldier = new Soldier("Jef", new Axe());
        army.enlist(soldier);

        Army army2 = new Army(headquarters);
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

    @Test
    public void whenArmyEnlistReturnSoldierId() {

        Army army = new Army(headquarters);
        Soldier soldier = new Soldier("Jef", new Axe());
        when(headquarters.reportEnlistment(soldier.getName())).thenReturn(5);
        army.enlist(soldier);

        Assertions.assertThat(soldier.getId()).isEqualTo(5);
    }
}
