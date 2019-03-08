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

    @Test
    public void checkIfTwoHandedSwordHas5Damage() {
        Weapon weapon = new TwoHandedSword();
        Assertions.assertThat(weapon.getDamage()).isEqualTo(5);
    }

    @Test
    public void checkIfBroadAxeHas2PlusAxeDamage() {
        Weapon weapon = new BroadAxe();
        Assertions.assertThat(weapon.getDamage()).isEqualTo(2 + new Axe().getDamage());
    }

    @Test
    public void checkIfTridentHas3TimesDamageOfSpear() {
        Weapon weapon = new Trident();
        Assertions.assertThat(weapon.getDamage()).isEqualTo(3 * new Spear().getDamage());
    }

    @Test
    public void checkIfAxeHasBonusDamage() {
        Weapon weapon = new Axe();
        Assertions.assertThat(weapon.enableBonusDamage()).isEqualTo(weapon.getDamage() + 3);
    }

    @Test
    public void checkIfSpearHasBonusDamage() {
        Weapon weapon = new Spear();
        Assertions.assertThat(weapon.enableBonusDamage()).isEqualTo(weapon.getDamage() + 3);
    }

    @Test
    public void checkIfSwordHasBonusDamage() {
        Weapon weapon = new Sword();
        Assertions.assertThat(weapon.enableBonusDamage()).isEqualTo(weapon.getDamage() + 3);
    }
}
