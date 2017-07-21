package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FightTest {

    @Test
    public void givenTwoSoldiers_WhenOneHasBiggerDamage_ThenHeIsTheWinner() {
        Soldier attacker = new Soldier("attacker", Weapon.BARE_FIST);
        Soldier receiver = new Soldier("receiver", Weapon.SPEAR);

        Soldier winner = new Fight(attacker, receiver).fight();

        assertThat(winner).isEqualToComparingFieldByField(receiver);
    }

    @Test
    public void givenTwoSoldiers_WhenTheyHaveEqualDamage_ThenAttackerWins() {
        Soldier attacker = new Soldier("attacker", Weapon.BARE_FIST);
        Soldier receiver = new Soldier("receiver", Weapon.BARE_FIST);

        Soldier winner = new Fight(attacker, receiver).fight();

        assertThat(winner).isEqualToComparingFieldByField(attacker);
    }

}
