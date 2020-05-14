package rpg;

import java.util.*;
import java.lang.Thread;

/**
 * Basic dialogue methods for the game.
 * 
 * @author Martin Calero Benjamin Proulx
 */

public class Dialogue {


    /**
     * 
     * Town simulation that has you talk to an NPC based on random dialogue.
     * 
     * @author Martin Calero
     * @param player player you want to bring into dialogue
     * @param npc npc you want to bring into dialogue
     * @throws InterruptedException
     */

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
            System.out.println("(2) Ask if they have a key");
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
                    npc.removeKey();
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
            System.out.println("(2) Ask if they have a key");
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
                    npc.removeKey();
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
            System.out.println("(2) Ask if they have a key");
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
                    npc.removeKey();
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
            System.out.println("(2) Ask if they have a key");
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
                    npc.removeKey();
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
            System.out.println("(2) Ask if they have a key");
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
                    npc.removeKey();
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
    
    /**
     * 
     *  Cave simulation that has you talk to a specific NPC in the cave
     * 
     * @author Martin Calero
     * @param player player you want to bring into dialogue
     * @param npc npc you want to bring into dialogue
     * @throws InterruptedException
     */
    
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
                    npc.removeKey();
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

    /**
     * Basic story exposition
     * @author Benjamin Proulx
     * @param player player you want to assign a name and exposure to.
     */

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
        System.out.println("(1) Continue to town.");
        System.out.println("(2) Exit Game.");

    }

    /**
     * 
     * NPC menu to find who to talk to.
     * 
     * @author Benjamin Proulx
     * @param player player you want to bring into the menu
     * @param npc1 first npc you want to bring into the menu
     * @param npc2 2nd npc you want to bring into the menu
     * @param npc3 3rd npc you want to bring into the menu
     * @param npc4 4th npc you want to bring into the menu
     * @param npc5 5th npc you want to bring into the menu
     * @throws InterruptedException
     */

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

    /**
     * 
     * Cave exposition
     * 
     * @author Benjamin Proulx
     * @param player player you want to bring into the cave
     * @throws InterruptedException
     */
    public static void caveExposition(Player player)
            throws InterruptedException {
        System.out.println(player.toString());
        System.out.println("You follow the sign that says 'cave' down the path for a couple meters until you are "+
        "greeted by a massive opening that goes deep, deep into the cave...\n Once inside the cave you venture forth " +
        "until you get to an opening and hear a yell, all of a sudden, you are attacked!");
    }

    /**
     * 
     * This prints if you win
     * 
     * @author Benjamin Proulx
     * 
     */
    public static void chestWin(){
        System.out.println("You walk into the next part of the cave to see the chest, you take out your " + 
        "3 keys and put each in the corresponding socket. As you open the chest, light envelops the room...");
        System.out.println("You win!");
    }

    /**
     * 
     * this prints if you lose
     * 
     * @author Benjamin Proulx
     * 
     */
    public static void chestLose(){
        System.out.println("You walk into the next part of the cave to see the chest, you realize that you do not " + 
        "have the keys required to open it. You hear a voice say 'foolish mortal, you do not have the required keys!'" +
        " are the room starts to collapse around you...");
        System.out.println("\n------\nGAME OVER\n------\n");
    }
}

