package learn.oop.domain.jobs;

import learn.oop.domain.behavior.attack.Attackable;

public abstract class Job {
    private final Attackable attackType;

    protected Job(Attackable attackType) {
        this.attackType = attackType;
    }

    public Attackable getAttackType() {
        return attackType;
    }
}
