package learn.oop.domain.jobs.magician;

import learn.oop.domain.behavior.attack.Attackable;
import learn.oop.domain.behavior.attack.type.magic.MagicAttack;
import learn.oop.domain.jobs.Job;

public class Magician extends Job {
    public Magician() {
        super(new MagicAttack());
    }
}
