package learn.oop.domain.character.player;

import learn.oop.domain.character.Character;
import learn.oop.domain.items.armor.Armor;
import learn.oop.domain.items.weapon.Weapon;
import learn.oop.domain.jobs.Job;
import learn.oop.domain.jobs.novice.Novice;

public class Player extends Character {
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

    @Override
    public void gotAttack() {

    }

    public int getDefenceScore() {
        return defenceScore;
    }

    public void setDefenceScore(int defenceScore) {
        this.defenceScore = defenceScore;
    }

    public int getAttackScore() {
        return attackScore;
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
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
