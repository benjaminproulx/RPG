package rpg;

import java.util.*;

public class Dialogue {

    //-----------------------------------------------------------------------------------------------

    public static void Town(Player player, Npc npc, char key) {
        
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
                case 1: 
                    System.out.println("My day has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==1){
            System.out.println(npc.getName());
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n(1) Ask about his day");
            System.out.println("(2) Ask if he has a key");
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("My day has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                    System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==2){
            System.out.println(npc.getName());
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n(1) Ask about his day");
            System.out.println("(2) Ask if he has a key");
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("My day has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");

                    if(key=='a'){
                        System.out.println("\nYou have obtained Key A!");
                    } else if(key=='b'){
                        System.out.println("\nYou have obtained Key B!");
                    } else if(key=='c'){
                        System.out.println("\nYou have obtained Key C!");
                    }
                        
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                    System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==3){
            System.out.println(npc.getName());
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n(1) Ask about his day");
            System.out.println("(2) Ask if he has a key");
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("My day has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");

                    if(key=='a'){
                        System.out.println("\nYou have obtained Key A!");
                    } else if(key=='b'){
                        System.out.println("\nYou have obtained Key B!");
                    } else if(key=='c'){
                        System.out.println("\nYou have obtained Key C!");
                    }
                        
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                    System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==4){
            System.out.println(npc.getName());
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n(1) Ask about his day");
            System.out.println("(2) Ask if he has a key");
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("My day has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");

                    if(key=='a'){
                        System.out.println("\nYou have obtained Key A!");
                    } else if(key=='b'){
                        System.out.println("\nYou have obtained Key B!");
                    } else if(key=='c'){
                        System.out.println("\nYou have obtained Key C!");
                    }
                        
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default:
                    System.out.println("Alright then, goodbye.");
            }

        }
        
    } 
    
    //-----------------------------------------------------------------------------------------------
    
    public static void Cave(Player player, Npc npc, char key){ 
        
        int npcNumber;
        Scanner sc = new Scanner(System.in);
        int input;

        npcNumber = (int) (Math.random()*0);

        if(npcNumber==0){
            System.out.println(npc.getName());
            System.out.println("Thank you for saving me! I've been stuck inside the cave for a while now.");
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n(1) Ask how he got here");
            System.out.println("(2) Ask if he has a key");
            System.out.println("(0) Say Goodbye");

            input = sc.nextInt();

            switch(input){
                case 1:
                    System.out.println("I don't really remember, all I recall is seeing a shiny object and picking it up,"+
                                        "next thing you know, skeletons and slimes appear from nowhere");
                
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("I knew that object was similarly shaped like a key. Here, you take it.");
                    
                    if(key=='a'){
                        System.out.println("\nYou have obtained Key A!");
                    } else if(key=='b'){
                        System.out.println("\nYou have obtained Key B!");
                    } else if(key=='c'){
                        System.out.println("\nYou have obtained Key C!");
                    }
                        
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default:
                    System.out.println("Alright then, goodbye! Thanks again for saving me!");
            }
        }
    }

    
}

