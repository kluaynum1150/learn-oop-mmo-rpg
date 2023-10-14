package learn.oop.domain.items.weapon.other;

import learn.oop.domain.items.weapon.Weapon;
import learn.oop.domain.jobs.Job;

public class Stick extends Weapon {
    public Stick(String name, int attackScore, Job whoCanUse) {
        super(name, attackScore, whoCanUse);
    }

    @Override
    public void use() {

    }
}
