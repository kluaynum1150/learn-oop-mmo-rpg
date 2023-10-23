package learn.oop.domain.character.player;

import learn.oop.domain.behavior.attack.Attackable;
import learn.oop.domain.behavior.attack.Damage;
import learn.oop.domain.character.Character;
import learn.oop.domain.items.armor.Armor;
import learn.oop.domain.items.weapon.Weapon;
import learn.oop.domain.jobs.Job;
import learn.oop.domain.jobs.novice.Novice;

public class Player extends Character implements Attackable {
    private int defenceScore;
    private int attackScore;
    private Job job;
    private Weapon weapon;
    private Armor armor;

    public Player(String name) {
        super(name);
        this.attackScore = 5;
        this.defenceScore = 5;
        this.job = new Novice();
    }

    public Player(String name, int hp) {
        super(name, hp);
        this.attackScore = 5;
        this.defenceScore = 5;
        this.job = new Novice();
    }

    public int getDefenceScore() {
        if (this.armor != null) {
            return  this.defenceScore + this.armor.getDefenceScore();
        }
        return this.defenceScore;
    }

    public void setDefenceScore(int defenceScore) {
        this.defenceScore = defenceScore;
    }

    public int getAttackScore() {
        if (this.weapon != null) {
            return this.attackScore + this.weapon.getAttackScore();
        }
        return this.attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        weapon.use();
        if (weapon.canUse(this)) {
            System.out.println("Set weapon done.");
            this.weapon = weapon;
        } else {
            System.out.println("Can't use this weapon.");
        }
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        armor.use();
        this.armor = armor;
    }

    @Override
    public Damage attack() {
        Damage damage = new Damage();
        damage.setAttackType(this.job.getAttackType());
        damage.setDamageScore(getAttackScore());
        return damage;
    }

    @Override
    public void gotAttack(Damage damage) {
        int realDamage = Math.max(0, damage.getDamageScore() - getDefenceScore());
        System.out.println(this.getName() + " got " + realDamage + " damage.");
        this.setHp(Math.max(0, this.getHp() - realDamage));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + getName() +
                ", hp=" + getHp() +
                ", defenceScore=" + defenceScore +
                ", attackScore=" + attackScore +
                ", job=" + job +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
