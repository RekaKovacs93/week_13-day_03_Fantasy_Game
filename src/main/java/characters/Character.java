package characters;
import characters.ability.Ability;
import items.Item;
import items.ItemType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int healthPoints;
    private ArrayList<Item> inventory;
    private Item weapon;
    private Item tool;
    private int armor;
    private Ability ability;

    public Character(String name,Item weapon) {
        this.name = name;
        this.healthPoints = 100;
        this.inventory = new ArrayList<>();
        this.weapon = weapon;
    }


    public String getName() {
        return name;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void addHealthPoints(int val){
        this.healthPoints += val;
    }

    public void reduceHealthPoints(int val){
        this.healthPoints -= val;
    }

    public Ability getAbility() {
        return ability;
    }


    public void reduceArmor(int damage){
        armor -= damage;
    }

    public void addArmor(int defend){
        armor += defend;
    }


    public Item getWeapon() {
        return weapon;
    }

    public int getArmor() {
        return armor;
    }

    public Item getTool() {
        return tool;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void addToInventory(Item item){
        this.inventory.add(item);
    }

    public void setWeapon(Item item) {
        if (item.getType()== ItemType.DAMAGE) {
            this.weapon = item;
        }
    }
}

