package learn.oop.domain.items.weapon.swords;

import learn.oop.domain.items.weapon.Weapon;
import learn.oop.domain.jobs.Job;

public class Sword extends Weapon {
    public Sword(String name, int attackScore, Job whoCanUse) {
        super(name, attackScore, whoCanUse);
    }

    @Override
    public void use() {

    }
}
