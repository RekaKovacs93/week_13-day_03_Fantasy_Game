package runner;

import Rooms.Room;
import characters.Character;
import characters.type.Caster;
import characters.type.Healer;
import characters.type.Warrior;
import items.Item;
import items.ItemType;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Room room;
    private HumanPlayer player;

    private Character character;
    private Item healthPotion = new Item("Health Potion", ItemType.HEAL, 5);
    private Item superHealthPotion = new Item("Super Health Potion", ItemType.HEAL, 10);
    private Item megaSuperHealthPotion = new Item("Mega Super Health Potion", ItemType.HEAL, 15);
    private Item hyperMegaSuperHealthPotion = new Item("Hyper Mega Super Health Potion", ItemType.HEAL, 20);
    private Item sword = new Item("Sword of DooOOom", ItemType.DAMAGE, 13);
    private Item axe = new Item("Reka's EPIC axe", ItemType.DAMAGE, 75);
    private Character goblin = new Warrior("Gobbo", sword);
    private ArrayList<Character> enemies;


    public Game() {
        enemies = new ArrayList<>();
        enemies.add(goblin);

    }



    public void choosePlayer() {

        Scanner playerChooseName = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = playerChooseName.nextLine();
        Scanner playerChooseCharacter = new Scanner(System.in);
        System.out.println("Welcome "+username+"! What are you? [W]arrior, [C]aster, [H]ealer ..");
        String userType = playerChooseCharacter.nextLine().toLowerCase();

        if (userType.equals("w")) {
             character = new Warrior(username,sword);
             player = new HumanPlayer(character);

            this.player.setPlayerCharacter(character);
        } else if (userType.equals("c")) {
             character = new Caster(username, sword);
            player = new HumanPlayer(character);

            this.player.setPlayerCharacter(character);
        } else if (userType.equals("h")) {
             character = new Healer(username, sword);
            player = new HumanPlayer(character);

        } else {
            System.out.println("W C H <<<<");
        }
        System.out.println(this.player.getPlayerCharacter().getClass());

    }

    //    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//    System.out.println("Enter username");
//
//    String userName = myObj.nextLine();  // Read user input
//    System.out.println("Username is: " + userName);  // Output user input
//    public void startGame() {
//        //asks player to select a character
//        System.out.println("Choose a character");
//        // ask player to name the character
//        //assign character to player
//        //give start sword to player
//
//        //get player in room
//        //console log enemy
//        //give choice to player on action
//        //when action is selected have enemy attack
//
//
//    }
}
