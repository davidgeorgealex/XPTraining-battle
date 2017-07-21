package be.cegeka.battle;

public enum Weapon {
    BARE_FIST(1),
    SPEAR(2),
    SWORD(2),
    AXE(3);

    private int damage;

    Weapon(int damage) {

        this.damage = damage;
    }

    public int damage() {
        return damage;
    }
}
