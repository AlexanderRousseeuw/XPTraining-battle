package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void soldierHasDefaultWeapon() {
        Soldier soldier = new Soldier("name");
        assertThat(soldier.getWeapon()).isInstanceOf(BareFist.class);
    }

    @Test
    public void canGiveSoldierAxe() {
        Soldier soldier = new Soldier("name", new Axe());
        assertThat(soldier.getWeapon()).isInstanceOf(Axe.class);
    }

    @Test
    public void canGiveSoldierSword() {
        Soldier soldier = new Soldier("name", new Sword());
        assertThat(soldier.getWeapon()).isInstanceOf(Sword.class);
    }

    @Test
    public void canGiveSoldierSpear() {
        Soldier soldier = new Soldier("name", new Spear());
        assertThat(soldier.getWeapon()).isInstanceOf(Spear.class);
    }

    @Test
    public void soldierCanFightAnotherSoldier() {
        Soldier soldier = new Soldier("name", new Spear());
        Soldier soldier2 = new Soldier("name2", new Spear());
        assertThat(soldier.fight(soldier2)).isNotNull();
    }
}