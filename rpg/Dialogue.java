package rpg;

import java.util.*;
import java.lang.Thread;

public class Dialogue {

    // martin this dialogue class is getting loooooooooooooooong

    //-----------------------------------------------------------------------------------------------

    public static void town(Player player, Npc npc) throws InterruptedException {
        
        int input;
        Scanner sc = new Scanner(System.in);
        int npcNumber;

        npcNumber = (int)(Math.random() * 4);

        System.out.println("\n----------\n" + npc.getName() + "\n----------");

        if(npcNumber==0){
            
            System.out.println("\nWhat would you like to do?");
            Thread.sleep(200);
            System.out.println("\n(1) Ask about their dog");
            Thread.sleep(200);
            System.out.println("(2) Ask if they has a key");
            Thread.sleep(200);
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("My dog has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");
                    if(npc.getKey()=='a'){
                        System.out.println("\nYou have obtained Key A!");
                        player.giveKey('a');
                    } else if(npc.getKey()=='b'){
                        System.out.println("\nYou have obtained Key B!");
                        player.giveKey('b');
                    } else if(npc.getKey()=='c'){
                        System.out.println("\nYou have obtained Key C!");
                        player.giveKey('c');
                    }
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==1){
            
            System.out.println("\nWhat would you like to do?");
            Thread.sleep(200);
            System.out.println("\n(1) Ask about their cat");
            Thread.sleep(200);
            System.out.println("(2) Ask if they has a key");
            Thread.sleep(200);
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("My cat is fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");
                    if(npc.getKey()=='a'){
                        System.out.println("\nYou have obtained Key A!");
                        player.giveKey('a');
                    } else if(npc.getKey()=='b'){
                        System.out.println("\nYou have obtained Key B!");
                        player.giveKey('b');
                    } else if(npc.getKey()=='c'){
                        System.out.println("\nYou have obtained Key C!");
                        player.giveKey('c');
                    }
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                    System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==2){
            
            System.out.println("\nWhat would you like to do?");
            Thread.sleep(200);
            System.out.println("\n(1) Ask about their day");
            Thread.sleep(200);
            System.out.println("(2) Ask if they has a key");
            Thread.sleep(200);
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

                    if(npc.getKey()=='a'){
                        System.out.println("\nYou have obtained Key A!");
                        player.giveKey('a');
                    } else if(npc.getKey()=='b'){
                        System.out.println("\nYou have obtained Key B!");
                        player.giveKey('b');
                    } else if(npc.getKey()=='c'){
                        System.out.println("\nYou have obtained Key C!");
                        player.giveKey('c');
                    }
                        
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                    System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==3){
            
            System.out.println("\nWhat would you like to do?");
            Thread.sleep(200);
            System.out.println("\n(1) Ask about their shop");
            Thread.sleep(200);
            System.out.println("(2) Ask if they has a key");
            Thread.sleep(200);
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("My shop has been fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");

                    if(npc.getKey()=='a'){
                        System.out.println("\nYou have obtained Key A!");
                        player.giveKey('a');
                    } else if(npc.getKey()=='b'){
                        System.out.println("\nYou have obtained Key B!");
                        player.giveKey('b');
                    } else if(npc.getKey()=='c'){
                        System.out.println("\nYou have obtained Key C!");
                        player.giveKey('c');
                    }
                        
                } else {
                    System.out.println("No I don't have a key.");
                }
                break;

                default: 
                    System.out.println("Alright then, goodbye.");
            }

        } else if(npcNumber==4){
            
            System.out.println("\nWhat would you like to do?");
            Thread.sleep(200);
            System.out.println("\n(1) Ask about the weather");
            Thread.sleep(200);
            System.out.println("(2) Ask if they has a key");
            Thread.sleep(200);
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: 
                    System.out.println("The weather is fine, thank you.");
                break;

                case 2: 
                if(npc.hasKey()){
                    player.giveKey(npc.getKey());
                    System.out.println("Here is my key!");

                    if(npc.getKey()=='a'){
                        System.out.println("\nYou have obtained Key A!");
                        player.giveKey('a');
                    } else if(npc.getKey()=='b'){
                        System.out.println("\nYou have obtained Key B!");
                        player.giveKey('b');
                    } else if(npc.getKey()=='c'){
                        System.out.println("\nYou have obtained Key C!");
                        player.giveKey('c');
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
    
    public static void cave(Player player, Npc npc) throws InterruptedException {
        
        int npcNumber;
        Scanner sc = new Scanner(System.in);
        int input;

        npcNumber = (int) (Math.random()*0);

        System.out.println("----------\n" + npc.getName() + "\n----------");
        
        if(npcNumber==0){
            
            System.out.println("Thank you for saving me! I've been stuck inside the cave for a while now.");
            System.out.println("\nWhat would you like to do?");
            Thread.sleep(200);
            System.out.println("\n(1) Ask how they got here");
            Thread.sleep(200);
            System.out.println("(2) Ask if they have a key");
            Thread.sleep(200);
            System.out.println("(0) Say Goodbye");
            Thread.sleep(200);

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
                    
                    if(npc.getKey()=='a'){
                        System.out.println("\nYou have obtained Key A!");
                        player.giveKey('a');
                    } else if(npc.getKey()=='b'){
                        System.out.println("\nYou have obtained Key B!");
                        player.giveKey('b');
                    } else if(npc.getKey()=='c'){
                        System.out.println("\nYou have obtained Key C!");
                        player.giveKey('c');
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

    //-----------------------------------------------------------------------------------------------

    public static void exposition(Player player){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your character name: ");
        player.setName(sc.nextLine());
        System.out.println("Your character, " + player.getName() + " is found in the Glanet region of the " +
        "Eravate continent, they have been tasked with opening the chest that contains a magical item to stop " + 
        "the rise of the dark forces of Alrhai. To open the chest they must get 3 keys from 3 different people" +
        " found in the Sol town. Once your character has 2 of those keys, they must journey to the cave to get " +
        "the last key from someone kidnapped there after defeating 3 enemies.\nYou are currently on a path to the town" +
        ", what would you like to do?");

    }

    //-----------------------------------------------------------------------------------------------

    public static void townDescription(Player player, Npc npc1, Npc npc2, Npc npc3, Npc npc4, Npc npc5)
            throws InterruptedException {
        
        boolean proceed = true;
        Scanner sc = new Scanner(System.in);
        int input;

      
        while(proceed == true){

            System.out.println(player.toString());
            System.out.println("You now find yourself in a town. Around you you see 5 people and a sign that says cave, what would you like to do?\n");
            System.out.println("(1) Talk to " + npc1.getName());
            Thread.sleep(200);
            System.out.println("(2) Talk to " + npc2.getName());
            Thread.sleep(200);
            System.out.println("(3) Talk to " + npc3.getName());
            Thread.sleep(200);
            System.out.println("(4) Talk to " + npc4.getName());
            Thread.sleep(200);
            System.out.println("(5) Talk to " + npc5.getName());
            Thread.sleep(200);
            System.out.println("(6) Go to the cave.");

            input = sc.nextInt();

            switch(input){
                case 1:
                Dialogue.town(player, npc1);
                break;
                case 2:
                Dialogue.town(player, npc2);
                break;
                case 3:
                Dialogue.town(player, npc3);
                break;
                case 4:
                Dialogue.town(player, npc4);
                break;
                case 5:
                Dialogue.town(player, npc5);
                break;
                case 6:
                if(player.hasKeyB() && player.hasKeyC()) {
                    proceed = false;
                } else {
                    System.out.println("You do not have both of the keys, go get them!");
                }
                break;
                default:
                System.out.println("Error: Enter a valid selection.");
                break;
            }
        }
    }

    public static void caveExposition(Player player, Enemy enemyOne, Enemy enemyTwo, Enemy enemyThree, Npc johnasuila)
            throws InterruptedException {
        System.out.println(player.toString());
        System.out.println("You now find yourself in a cave and have been attacked!");

        Combat.doCombat(player, enemyOne, enemyTwo, enemyThree, johnasuila);
    }
}

