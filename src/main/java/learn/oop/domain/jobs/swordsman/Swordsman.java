package learn.oop.domain.jobs.swordsman;

import learn.oop.domain.behavior.attack.AttackType;
import learn.oop.domain.jobs.Job;

public class Swordsman extends Job {
    public Swordsman() {
        super(AttackType.PHYSICAL);
    }
}
