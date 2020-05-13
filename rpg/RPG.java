package rpg;

import java.util.*;

public class RPG{

    // are ya coding son?
    public static void main(String[] args) throws InterruptedException {


        Enemy enemyOne = new Enemy();
        Enemy enemyTwo = new Enemy();
        Enemy enemyThree = new Enemy();

        Npc johnasuila = new Npc("Johnasuila", '?', 'a');
        Npc johnny = new Npc("Johnny", 'm', 'b');
        Npc jack = new Npc("Jack", 'm', 'c');
        Npc jaqueline = new Npc("Jaqueline", 'f');
        Npc jill = new Npc("Jill", 'f');
        Npc justine = new Npc("Justine", 'f');

        Player player = new Player();

        Dialogue.townDescription(player, johnny, jack, jaqueline, jill, justine);



    }
}