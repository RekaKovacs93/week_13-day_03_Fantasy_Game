package Rooms;

import characters.Character;

import java.util.ArrayList;

public class Room {

    private ArrayList<Character> enemies;
    private Character player;
    private int roomNo;

    public Room(ArrayList enemies,Character player,int roomNo){
        this.roomNo = roomNo;
        this.enemies = enemies;
        this.player = player;
    }

    public ArrayList<Character> getEnemies() {
        return enemies;
    }

    public Character getPlayer() {
        return player;
    }

}
