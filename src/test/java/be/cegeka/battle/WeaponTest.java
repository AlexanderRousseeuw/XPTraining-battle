package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WeaponTest {

    @Test
    public void checkIfAxeHasDamage() {
        Weapon weapon = new Axe();
        Assertions.assertThat(weapon.getDamage()).isEqualTo(3);
    }

    @Test
    public void checkIfBareFistHasDamage() {
        Weapon weapon = new BareFist();
        Assertions.assertThat(weapon.getDamage()).isEqualTo(1);
    }

    @Test
    public void checkIfSwordHasDamage() {
        Weapon weapon = new Sword();
        Assertions.assertThat(weapon.getDamage()).isEqualTo(2);
    }

    @Test
    public void checkIfSpearHasDamage() {
        Weapon weapon = new Spear();
        Assertions.assertThat(weapon.getDamage()).isEqualTo(2);
    }
}
