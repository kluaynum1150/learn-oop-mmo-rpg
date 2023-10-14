package learn.oop.domain.items.armor;

import learn.oop.domain.items.Item;

public class Armor implements Item {
    private final String name;
    private final int defenceScore;

    public Armor(String name, int defenceScore) {
        this.name = name;
        this.defenceScore = defenceScore;
    }

    @Override
    public void use() {

    }

    public String getName() {
        return name;
    }

    public int getDefenceScore() {
        return defenceScore;
    }
}
