package rpg;

public class Player {
    
    String name;
    String keyAInventory = "";
    String keyBInventory = "";
    String keyCInventory = "";
    int health;
    int maxHealth;
    boolean hasKeyA;
    boolean hasKeyB;
    boolean hasKeyC;
    boolean isAlive = true;

    public Player(String playerName){
        playerName = playerName.toLowerCase();
        playerName = playerName.substring(0,1).toUpperCase() + playerName.substring(1);
        name = playerName;
        health = (int)(Math.random() * 10 + 10); // generates player health anywhere between 10-20 for variety every time you play.
        maxHealth = health;
    }

    public String toString() {
        return "Name: " + name + "\nHealth: " + health + "\nInventory: " + keyAInventory + keyBInventory + keyCInventory;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

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

    public void damage(int amount){
        health = health - amount;

        System.out.println(name + " has taken " + amount + " damage.");

        if(health <= 0){
            isAlive = false;
            System.out.println("You have died.");
        }
    }

    public void heal(int amount){
        health = health + amount;
        if(health > maxHealth){
            health = maxHealth;
        }
    }

    public boolean isPlayerAlive(){
        return isAlive;
    }

    public int attack(){
        return (int)(Math.random()*5 + 1);
    }

}