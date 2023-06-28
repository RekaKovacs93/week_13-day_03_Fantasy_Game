package characters.type;

import characters.Character;
import characters.ability.Ability;
import characters.ability.AbilityType;
import items.Item;

public class Caster extends Character {

    private Ability ability;

    public Caster(String name, Item weapon){
        super(name,weapon);
        this.ability = new Ability("Fire Ball", 15, AbilityType.DAMAGE);

    }


    public void cast(Character character){
        character.reduceHealthPoints(ability.getValue());
    }

    public void attack(Character character){
        character.reduceHealthPoints((getWeapon().getValue()));
    }

}
