package characters.type;

import characters.Character;
import characters.ability.Ability;
import characters.ability.AbilityType;
import characters.interfaces.IFight;
import items.Item;
import items.ItemType;


public class Warrior extends Character implements IFight {

    Item weapon;
    Ability ability;

    int armor;

    public Warrior(String name,Item weapon) {
        super(name, weapon);
        this.armor = 100;
        this.ability = new Ability("Energy shield", 15, AbilityType.DEFENCE);
    }





    public void addDamageWeaponToInventory(Item item){
        if (item.getType()== ItemType.DAMAGE){
            addToInventory(item);
        }
    }

    public void attack(Character character) {
        character.reduceHealthPoints(weapon.getValue());
    }
    public void cast(Character character){
        character.addArmor(ability.getValue());
    }

}
