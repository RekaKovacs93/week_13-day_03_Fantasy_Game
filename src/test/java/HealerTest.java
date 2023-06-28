import characters.type.Healer;
import characters.type.Warrior;
import items.Item;
import items.ItemType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HealerTest {

    Healer healer;
    Warrior rando;
    Warrior goblin;

    Item potion;
    Item weapon;
    Item weapon1;


    @Before
    public void setUp(){
        weapon = new Item("Sword", ItemType.DAMAGE, 20);
        weapon1 = new Item("Dagger", ItemType.DAMAGE, 10);
        rando = new Warrior("DanMan",weapon);
        goblin = new Warrior("Gobbo", weapon1);
        potion = new Item("Manganukalavaba", ItemType.HEAL,5);
        healer = new Healer("Reka", potion);

    }

    @Test
    public void canHeal(){
        goblin.attack(rando);
        healer.cast(rando);
        assertEquals(95, rando.getHealthPoints());
    }


}
