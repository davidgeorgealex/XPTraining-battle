package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name", Weapon.BARE_FIST);
        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null, Weapon.BARE_FIST);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("", Weapon.BARE_FIST);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ", Weapon.BARE_FIST);
    }

    @Test
    public void givenASoldier_ThenCanEquipWithWeapon() {
        Soldier soldier = new Soldier("name", Weapon.BARE_FIST);

        assertThat(soldier.getWeapon()).isEqualTo(Weapon.BARE_FIST);
    }

}