package be.cegeka.battle;

public class Fight {

    private final Soldier attacker;
    private final Soldier receiver;

    public Fight(Soldier attacker, Soldier receiver) {
        this.attacker = attacker;
        this.receiver = receiver;
    }

    public Soldier fight() {
        if (attacker.damage() >= receiver.damage()) {
            return attacker;
        }

        return receiver;
    }

}
