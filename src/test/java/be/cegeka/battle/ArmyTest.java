package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {

    @Test
    public void givenAnArmy_ThenASoldierCanBeEnrolled() {
        Army army = new Army();
        Soldier soldier = new Soldier("soldier", Weapon.BARE_FIST);

        army.enlist(soldier);

        assertThat(army.getSoldiers()).containsExactly(soldier);
    }
}
