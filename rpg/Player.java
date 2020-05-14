package rpg;

/**
 * @author Benjamin Proulx
 * Player object for storing player data such as inventory.
 */

public class Player {
    
    private String name;
    private String keyAInventory = "";
    private String keyBInventory = "";
    private String keyCInventory = "";
    private int health;
    private int maxHealth;
    private boolean hasKeyA;
    private boolean hasKeyB;
    private boolean hasKeyC;
    private boolean isAlive = true;


    /**
     * Constructor for a player with a random health pool from 10-20.
     */
    public Player(){
        health = (int)(Math.random() * 10 + 10); // generates player health anywhere between 10-20 for variety every time you play.
        maxHealth = health;
    }

    /**
     * Displays the player's information.
     * @return String
     */
    public String toString() {
        return "\n\n\n\n\n\n\n\n----------------------------\n" + "Name: " + name + "\nHealth: " + health + "\nInventory: " + keyAInventory + keyBInventory + keyCInventory + "\n----------------------------";
    }

    /**
     * Gets the player's name
     * @return String
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the players health
     * @return
     */
    public int getHealth(){
        return health;
    }

    /**
     * Gives the player a key.
     * @param key the key to be given
     */
    public void giveKey(char key){
        switch(key){
            case 'a':
            hasKeyA = true;
            keyAInventory = "Key A ";
            break;
            case 'b':
            hasKeyB = true;
            keyBInventory = "Key B ";
            break;
            case 'c':
            hasKeyC = true;
            keyCInventory = "Key C";
            break;            
        }
    }

    /**
     * Damages the player for a certain amount and displays it
     * @param amount amount of damage to be done
     */
    public void damage(int amount){
        health = health - amount;

        System.out.println(name + " has taken " + amount + " damage.");

        if(health <= 0){
            isAlive = false;
            System.out.println("You have died.");
        }
    }

    /**
     * heals the player for a certain amount and displays it
     * @param amount amount of healing to be done
     */
    public void heal(int amount){
        health = health + amount;
        if(health > maxHealth){
            health = maxHealth;
        }
    }

    /**
     * Checks if the player is alive
     * @return boolean
     */
    public boolean isPlayerAlive(){
        return isAlive;
    }

    /**
     * Changes the player name
     * @param playerName name to set the player to
     */
    public void setName(String playerName){
        playerName = playerName.toLowerCase();
        playerName = playerName.substring(0,1).toUpperCase() + playerName.substring(1);
        name = playerName;
    }

    /**
     * Returns a random number for player to damage an enemy with.
     * @return int
     */
    public int attack(){
        return (int)(Math.random()*5 + 1);
    }

    /**
     * Checks if the player has A key
     * @return boolean
     */
    public boolean hasKeyA(){
        return hasKeyA;
    }

    /**
     * Checks if the player has B key
     * @return boolean
     */
    public boolean hasKeyB(){
        return hasKeyB;
    }

    /**
     * Checks if the player has C key
     * @return boolean
     */
    public boolean hasKeyC(){
        return hasKeyC;
    }

}