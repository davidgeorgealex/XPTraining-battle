package be.cegeka.battle;

import com.google.common.collect.Lists;

import java.util.List;

public class Army {

    List<Soldier> soldiers = Lists.newArrayList();

    public void enlist(Soldier soldier) {
        soldiers.add(soldier);
    }

    public List<Soldier> getSoldiers() {
        return Lists.newArrayList(soldiers);
    }
}
