package rpg;

import java.util.*;

/**
 * @author Benjamin Proulx
 * Combat class.
 */

public class Combat {

    /**
     * Puts the player in combat with 3 enemies
     * 
     * This class only has 1 method instead of 6 seeing as we could not find any other reason to have
     * more methods for this class.
     * 
     * @param player the player object you want to bring into combat
     * @param enemyOne first enemy to bring into combat
     * @param enemyTwo second enemy to bring into combat
     * @param enemyThree third enemy to bring into combat
     * 
     * @throws InterruptedException
     */
    
    public static void doCombat(Player player, Enemy enemyOne, Enemy enemyTwo, Enemy enemyThree)
            throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int selection;

        System.out.println(player.getName() + " has engaged a " + enemyOne.getType() + ", " + enemyTwo.getType() + " and a " + enemyThree.getType());

        do {
            System.out.println(player.toString());
            System.out.println("Who would you like to attack?\n");
            System.out.println("(1)" + enemyOne.toString());
            System.out.println("(2)" + enemyTwo.toString());
            System.out.println("(3)" + enemyThree.toString());
            
            selection = sc.nextInt();
            
            switch(selection){
                case 1:
                if (enemyOne.isAlive()){
                    enemyOne.damage(player.attack());
                }
                break;
                case 2:
                if (enemyTwo.isAlive()){
                    enemyTwo.damage(player.attack());
                }
                break;
                case 3:
                if (enemyThree.isAlive()){
                    enemyThree.damage(player.attack());
                }
                break;
                default:
                System.out.println("Error: Enter a valid selection.");
                break;
            }
            
            if(Math.random() > .5 && enemyOne.isAlive()){
                System.out.println(enemyOne.getType() + " has attacked " + player.getName());
                player.damage(enemyOne.attack());
                
            }
            
            if(Math.random() > .5 && enemyTwo.isAlive()){
                System.out.println(enemyTwo.getType() + " has attacked " + player.getName());
                player.damage(enemyTwo.attack());
            }
            
            if(Math.random() > .5 && enemyThree.isAlive()){
                System.out.println(enemyThree.getType() + " has attacked " + player.getName());
                player.damage(enemyThree.attack());
            }
            
        } while(Enemy.enemyCount() > 0 && player.isPlayerAlive());
    
    
    }

}