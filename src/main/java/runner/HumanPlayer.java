package runner;

import characters.Character;
import items.Item;

public class HumanPlayer {

    private Character playerCharacter;
    public HumanPlayer(Character playerCharacter){
        this.playerCharacter = playerCharacter;
    }

    public void setPlayerCharacter(Character playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public Character getPlayerCharacter() {
        return playerCharacter;
    }

    //    public
//    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//    System.out.println("Enter username");
//
//    String userName = myObj.nextLine();  // Read user input
//    System.out.println("Username is: " + userName);  // Output user input
//
}
