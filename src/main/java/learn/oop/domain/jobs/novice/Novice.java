package learn.oop.domain.jobs.novice;

import learn.oop.domain.behavior.attack.AttackType;
import learn.oop.domain.jobs.Job;

public class Novice extends Job {
    public Novice() {
        super(AttackType.PHYSICAL);
    }
}
