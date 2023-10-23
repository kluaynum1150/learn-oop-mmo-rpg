package learn.oop.domain.items.weapon.magic_staff;

import learn.oop.domain.items.weapon.Weapon;
import learn.oop.domain.jobs.Job;

public class MagicStaff extends Weapon {
    public MagicStaff(String name, int attackScore, Job whoCanUse) {
        super(name, attackScore, whoCanUse);
    }

    @Override
    public void use() {
        System.out.println("Use " + this.getName());
    }
}
