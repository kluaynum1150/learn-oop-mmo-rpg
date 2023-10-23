package learn.oop.domain.character.monster;

import learn.oop.domain.behavior.attack.AttackType;
import learn.oop.domain.behavior.attack.Attackable;
import learn.oop.domain.behavior.attack.Damage;
import learn.oop.domain.character.Character;

public class Monster extends Character implements Attackable {
    private int physicalDefend;
    private int magicDefend;
    private int attackScore;

    public Monster(String name, int hp, int physicalDefend, int magicDefend, int attackScore) {
        super(name, hp);
        this.physicalDefend = physicalDefend;
        this.magicDefend = magicDefend;
        this.attackScore = attackScore;
    }

    public int getPhysicalDefend() {
        return physicalDefend;
    }

    public void setPhysicalDefend(int physicalDefend) {
        this.physicalDefend = physicalDefend;
    }

    public int getMagicDefend() {
        return magicDefend;
    }

    public void setMagicDefend(int magicDefend) {
        this.magicDefend = magicDefend;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    @Override
    public Damage attack() {
        Damage damage = new Damage();
        damage.setDamageScore(getAttackScore());
        return damage;
    }

    @Override
    public void gotAttack(Damage damage) {
        int realDamage;
        if (damage.getAttackType() == AttackType.PHYSICAL) {
            realDamage = Math.max(0, damage.getDamageScore() - getPhysicalDefend());
        } else if (damage.getAttackType() == AttackType.MAGIC) {
            realDamage = Math.max(0, damage.getDamageScore() - getMagicDefend());
        } else {
            System.out.println("Attack type unknown");
            return;
        }
        System.out.println(this.getName() + " got " + realDamage + " damage.");
        this.setHp(Math.max(0, this.getHp() - realDamage));
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name=" + getName() +
                ", hp=" + getHp() +
                ", physicalDefend=" + physicalDefend +
                ", magicDefend=" + magicDefend +
                ", attackScore=" + attackScore +
                '}';
    }
}
