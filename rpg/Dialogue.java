package rpg;

import java.util.*;

public class Dialogue {

    double npc;
    int input;
    Scanner sc = new Scanner(System.in);
    

    public void Town() {
    
        npc = Math.random() * 4;

        if(npc==0){
            System.out.println("Joe");
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n(1) Ask about his day");
            System.out.println("(2) Ask if he has a key");
            System.out.println("(0) Say Goodbye");
            
            input = sc.nextInt();

            switch(input){
                case 1: System.out.println("My day has been fine, thank you.");
                break;

                case 2: System.out.println("No I don't have a key.");
                break;

                default: System.out.println("Alright then, goodbye.");
            }

        } else if (npc==1){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        } else if (npc==2){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        } else if (npc==3){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        } else if (npc==4){
            System.out.println("Jack");
            System.out.println("\nWhat would you like to do?");

        }
        
    }   
    
}

