package learn.oop.domain.items.weapon;

import learn.oop.domain.character.player.Player;
import learn.oop.domain.items.Item;
import learn.oop.domain.jobs.Job;

public abstract class Weapon implements Item {
    private final String name;
    private final int attackScore;
    private final Job whoCanUse;

    protected Weapon(String name, int attackScore, Job whoCanUse) {
        this.name = name;
        this.attackScore = attackScore;
        this.whoCanUse = whoCanUse;
    }

    public String getName() {
        return name;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public Job getWhoCanUse() {
        return whoCanUse;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", attackScore=" + attackScore +
                ", whoCanUse=" + whoCanUse +
                '}';
    }

    public boolean canUse(Player player) {
        return this.whoCanUse.getClass() == player.getJob().getClass();
    }
}
