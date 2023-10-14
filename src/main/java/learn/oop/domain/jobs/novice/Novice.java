package learn.oop.domain.jobs.novice;

import learn.oop.domain.behavior.attack.type.physical.PhysicalAttack;
import learn.oop.domain.jobs.Job;

public class Novice extends Job {
    public Novice() {
        super(new PhysicalAttack());
    }
}
