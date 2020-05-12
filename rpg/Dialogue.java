package rpg;

import java.util.*;

public class Dialogue {

    public static void Town(Player player, Npc npc) {
        
        int input;
        Scanner sc = new Scanner(System.in);
        int npcNumber;

        npcNumber = (int)(Math.random() * 4);

        if(npcNumber==0){
            System.out.println(npc.getName());
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n(1) Ask about his day");
            System.out.println("(2) Ask if he has a key");
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: System.out.println("My day has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: System.out.println("Alright then, goodbye.");
            }

        } else if (npcNumber==1){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        } else if (npcNumber==2){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        } else if (npcNumber==3){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        } else if (npcNumber==4){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        }
        
    }   
    
}

