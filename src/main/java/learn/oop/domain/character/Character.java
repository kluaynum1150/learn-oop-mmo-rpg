package learn.oop.domain.character;

public abstract class Character {
    private String name;
    private int hp;

    protected Character(String name) {
        this.name = name;
        this.hp = 100;
    }

    protected Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void gotAttack();

    public boolean isDied() {
        return this.hp <= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
