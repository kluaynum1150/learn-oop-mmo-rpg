package learn.oop;

import learn.oop.domain.character.monster.Monster;
import learn.oop.domain.character.player.Player;
import learn.oop.domain.items.armor.Armor;
import learn.oop.domain.items.weapon.Weapon;
import learn.oop.domain.items.weapon.swords.Sword;
import learn.oop.domain.jobs.swordsman.Swordsman;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Welcome to MMORPG---");
        System.out.println("---Create Player---");
        Player player = new Player("Banana");
        player.setJob(new Swordsman());
        Armor armor = new Armor("Iron armor", 10);
        player.setArmor(armor);
        Weapon sword = new Sword("Excalibur sword", 100, new Swordsman());
        player.setWeapon(sword);
        System.out.println(player);
        System.out.println("---Create Monster---");
        Monster monster = new Monster("Dragon", 500, 50, 50, 25);
        System.out.println(monster);
        System.out.println("---Start Battle---");
        while (true) {
            monster.gotAttack(player.attack());
            System.out.println(monster.getName() + " has " + monster.getHp() + " HP remaining");
            if (monster.isDied()) {
                System.out.println(monster.getName() + " is died.");
                break;
            }
            player.gotAttack(monster.attack());
            System.out.println(player.getName() + " has " + player.getHp() + " HP remaining");
            if (player.isDied()) {
                System.out.println(player.getName() + " is died.");
                break;
            }
        }
        System.out.println("---Battle finished---");
        String winner = player.isDied() ? monster.getName() : player.getName();
        System.out.println("Winner is " + winner);
    }
}