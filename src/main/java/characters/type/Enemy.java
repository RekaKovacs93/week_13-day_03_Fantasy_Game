package characters.type;

import characters.Character;
import characters.ability.Ability;
import characters.ability.AbilityType;
import items.Item;

public class Enemy extends Character {

    private Ability ability;
    public Enemy(String name,Item weapon){
        super(name,weapon);
        this.ability = new Ability("RawrNStuff",15, AbilityType.DAMAGE);

    }
}
