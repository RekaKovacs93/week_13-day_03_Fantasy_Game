package characters.type;

import characters.Character;
import characters.ability.Ability;
import characters.ability.AbilityType;
import characters.interfaces.ICast;
import characters.interfaces.IFight;
import items.Item;
import items.ItemType;


public class Healer extends Character implements ICast, IFight {

    private Item tool;
    private Item weapon;
    private Ability ability;
    public Healer(String name,Item weapon){
        super(name,weapon);
        this.weapon = weapon;
        this.ability = new Ability("Shrooms",15,AbilityType.HEAL);

    }

    public void setTool(Item tool) {
        this.tool = tool;
    }

    public void cast(Character character) {
        character.addHealthPoints(ability.getValue());
    }

    public void attack(Character character){
        character.reduceHealthPoints(getWeapon().getValue());
    }

    public void addHealingItemToInventory(Item item){
        if (item.getType()== ItemType.HEAL){
            addToInventory(item);
        }}
}
