package rpg;

import java.util.*;

public class Combat {
    
    public static void doCombat(Player player, Enemy enemyOne, Enemy enemyTwo, Enemy enemyThree, Npc npc){

        Scanner sc = new Scanner(System.in);
        int selection;

        System.out.println(player.getName() + " has engaged a " + enemyOne.getType() + ", " + enemyTwo.getType() + " and a " + enemyThree.getType());

        while(Enemy.enemyCount() > 0 && player.isPlayerAlive()){
            
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

        }

        if(player.isPlayerAlive()){

            Dialogue.Town(player, npc); // todo change Town for cave once martin finishes the cave method.

        }



    }

}