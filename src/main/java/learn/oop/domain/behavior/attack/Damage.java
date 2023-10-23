package learn.oop.domain.behavior.attack;

public class Damage {
    private AttackType attackType;
    private int damageScore;

    @Override
    public String toString() {
        return "Damage{" +
                "attackType=" + attackType +
                ", damageScore=" + damageScore +
                '}';
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public int getDamageScore() {
        return damageScore;
    }

    public void setDamageScore(int damageScore) {
        this.damageScore = damageScore;
    }
}
