package rpg;

import java.util.*;

/**
 * @author Benjamin Proulx Martin Calero
 */

public class RPG{

    /**
     * 
     * @throws InterruptedException
     */
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

        Scanner sc = new Scanner(System.in);
        int selection;
        boolean hasKeyBC = false;

        // CHALLENGE - All the dialogue is done from within the Dialogue.java class.
        Dialogue.exposition(player);
        selection = sc.nextInt();

        switch(selection){
            case 1:
            while(hasKeyBC == false){

                // CHALLENGE - All the dialogue is done from within the Dialogue.java class.
                Dialogue.townDescription(player, johnny, jack, jaqueline, jill, justine);
                if(player.hasKeyB() && player.hasKeyC()){
                    hasKeyBC = true;
                }
            }
            case 2:
            break;
            default:
            System.out.println("Error: Enter a valid selection.");
            break;
        }

        if(hasKeyBC == true){
            // CHALLENGE - All the dialogue is done from within the Dialogue.java class.
            Dialogue.caveExposition(player);
            // CHALLENGE - The combat is done entirely outside of the main class, split between the Enemy class and the Combat class.
            Combat.doCombat(player, enemyOne, enemyTwo, enemyThree);
            if(player.isPlayerAlive()){
                while(player.hasKeyA() == false){
                // CHALLENGE - All the dialogue is done from within the Dialogue.java class.
                Dialogue.cave(player, johnasuila);
                }
                if(player.hasKeyA() && player.hasKeyB() && player.hasKeyC()){
                    // CHALLENGE - All the dialogue is done from within the Dialogue.java class.
                    Dialogue.chestWin();
                } else {
                    // CHALLENGE - All the dialogue is done from within the Dialogue.java class.
                    Dialogue.chestLose();
                }
                
            }

        }

        


    }
}