package rpg;

/**
 * @author Martin Calero
 */

public class Enemy {
    
    private static int enemyCount = 0;
    private int enemyHealth;
    private String type;
    private boolean isAlive;
    private int damage;

    /**
     * Enemy constructor, creates a random enemy.
     * 
     */

    public Enemy(){
        isAlive = true;
        enemyCount++;
        if(Math.random() > 0.5){
            type = "Slime";
            enemyHealth = (int)(Math.random()* 6 + 1);
            damage = 1;
        } else {
            type = "Skeleton";
            enemyHealth = 1;
            damage = 5;
        }
    }

    /**
     * Outputs the enemy as a string, even if the enemy were to die
     * @return string
     */

    public String toString(){
        if(isAlive == true){
            return type + " with " + enemyHealth + " hp.";
        } else {
            return "[DEAD] " + type;
        }
    }

    /**
     * Damages the enemy
     * @param amount amount of damage to be done to enemy HP
     * 
     */

    public void damage(int amount){
        enemyHealth = enemyHealth - amount;

        System.out.println("The "+ type + " has taken " + amount + " damage.");

        if(enemyHealth <= 0){
            isAlive = false;
            System.out.println("The " + type + " has died.");
            enemyCount--;
        }
    }

    /**
     * Returns the damage that an enemy will do as an int
     * @return int
     * 
     */
    public int attack(){
        return damage;
    }

    /**
     * Returns if the enemy is alive or not
     * 
     * @return boolean
     */

    public boolean isAlive(){
        return isAlive;
    }

    /**
     * Returns an enemy's health pool
     * @return
     * 
     */

    public int getHealth(){
        return enemyHealth;
    }

    /**
     * Return's an enemy's type.
     * @return String
     * 
     */
    public String getType(){
        return type;
    }

    /**
     * Returns enemy count
     * @return int
     * 
     */
    public static int enemyCount(){
        return enemyCount;
    }

}