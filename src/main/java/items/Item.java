package items;

public class Item {

    private String name;
    private ItemType type;
    private int value;

    public Item(String name, ItemType type, int value){
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public ItemType getType() {
        return type;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

