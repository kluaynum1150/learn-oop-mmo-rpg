package learn.oop.domain.jobs;

import learn.oop.domain.behavior.attack.AttackType;

public abstract class Job {
    private final AttackType attackType;

    protected Job(AttackType attackType) {
        this.attackType = attackType;
    }

    public AttackType getAttackType() {
        return attackType;
    }
}
