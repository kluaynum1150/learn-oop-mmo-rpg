package learn.oop.domain.jobs.magician;

import learn.oop.domain.behavior.attack.AttackType;
import learn.oop.domain.jobs.Job;

public class Magician extends Job {
    public Magician() {
        super(AttackType.MAGIC);
    }
}
