package learn.oop.domain.behavior.attack;

public interface Attackable {
    Damage attack();
    void gotAttack(Damage damage);
}
