package learn.oop.domain.character.monster;

import learn.oop.domain.character.Character;

public class Monster extends Character {
    private int physicalDefend;
    private int magicDefend;
    private int attackScore;

    public Monster(String name, int hp, int physicalDefend, int magicDefend, int attackScore) {
        super(name, hp);
        this.physicalDefend = physicalDefend;
        this.magicDefend = magicDefend;
        this.attackScore = attackScore;
    }

    @Override
    public void gotAttack() {

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
}
