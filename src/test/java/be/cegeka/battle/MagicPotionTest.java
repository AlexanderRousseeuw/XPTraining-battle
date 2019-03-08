package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MagicPotionTest {

    @Test
    public void checkIfMagicPotionHas10Damage() {
        MagicPotion magicPotion = new MagicPotion();
        Assertions.assertThat(magicPotion.getDamage(2)).isEqualTo(10);
    }

    @Test
    public void checkIfMagicPotionHas0Damage() {
        MagicPotion magicPotion = new MagicPotion();
        Assertions.assertThat(magicPotion.getDamage(3)).isEqualTo(0);
    }
}