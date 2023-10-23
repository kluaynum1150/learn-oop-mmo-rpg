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

    public boolean isDied() {
        if (this.hp <= 0) {
            return true;
        }
        return false;
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
