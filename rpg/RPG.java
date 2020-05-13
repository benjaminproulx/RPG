package rpg;

import java.util.*;

public class RPG{

    // are ya coding son?
    public static void main(String[] args){


        Enemy enemyOne = new Enemy();
        Enemy enemyTwo = new Enemy();
        Enemy enemyThree = new Enemy();
        Npc jackeline = new Npc("Jackeline", '?', 'c');
        Player player = new Player("Todd");

        Combat.doCombat(player, enemyOne, enemyTwo, enemyThree, jackeline);


    }
}