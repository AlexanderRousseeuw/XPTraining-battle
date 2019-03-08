package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class HeadquartersTest {

    IHeadquarters headquarters = Mockito.mock(IHeadquarters.class);

    @Test
    public void HQIsNotifiedWhenSoldierIsEnlisted() {
        Soldier jos = new Soldier("Jos");

        when(headquarters.reportEnlistment(jos.getName())).thenReturn(1);

        Assertions.assertThat(headquarters.reportEnlistment(jos.getName())).isEqualTo(1);
    }
}