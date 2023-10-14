package learn.oop.domain.jobs.swordsman;

import learn.oop.domain.behavior.attack.type.physical.PhysicalAttack;
import learn.oop.domain.jobs.Job;

public class Swordsman extends Job {
    public Swordsman() {
        super(new PhysicalAttack());
    }
}
