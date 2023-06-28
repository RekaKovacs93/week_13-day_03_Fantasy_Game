package characters.ability;

public class Ability {

    private String name;
    private int value;
    private AbilityType type;
    public Ability(String name,int value,AbilityType type){
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public AbilityType getType() {
        return type;
    }


}
