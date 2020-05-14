package rpg;

/**
 * @author Benjamin Proulx
 * NPC's are use for dialogue and key storage.
 */

public class Npc {
    
    private String name;
    private char gender;
    private boolean hasKeyA;
    private boolean hasKeyB;
    private boolean hasKeyC;

    /**
     * Constructor for NPCs.
     * @param npcName Name of the npc
     * @param npcGender Gender of the npc
     */
    public Npc(String npcName, char npcGender){
        name = npcName;
        gender = npcGender;
    }

    /**
     * Constructor for NPCs with keys.
     * @param npcName Name of the npc
     * @param npcGender Gender of the npc
     * @param key Key to give the npc (a,b or c)
     */

    public Npc(String npcName, char npcGender, char key){
        name = npcName;
        gender = npcGender;
        if(key == 'a'){
            hasKeyA = true;
        } else if(key == 'b'){
            hasKeyB = true;
        } else if (key == 'c'){
            hasKeyC = true;
        }
    }

    /**
     * Returns the name of the npc
     * @return String
     */
    public String getName(){
        return name;
    }
    /**
     * Returns the gender of the npc.
     * @return char
     */
    public char getGender(){
        return gender;
    }

    /**
     * Returns a boolean of if the npc has a key or not
     * @return boolean
     */
    public boolean hasKey(){
        if(hasKeyA || hasKeyB || hasKeyC){
            return true;
        } else {
            return false;
        }
    }


    /**
     * Gets the key that a NPC is holding, or ' ' if they aren't holding one
     * 
     * @return char
     */

    public char getKey(){
        if(hasKeyA == true){
            return 'a';
        } else if(hasKeyB == true){
            return 'b';
        } else if(hasKeyC == true){
            return 'c';
        }
         return ' ';
    }


    /**
     * Takes away an NPC's key, no matter which key it is.
     * 
     */
    public void removeKey(){
        hasKeyA = false;
        hasKeyB = false;
        hasKeyC = false;
    }

}