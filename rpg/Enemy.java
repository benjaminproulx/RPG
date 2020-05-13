package rpg;

public class Enemy {
    
    private static int enemyCount = 0;
    private int enemyHealth;
    private String type;
    private boolean isAlive;
    private int damage;
    
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

    public String toString(){
        if(isAlive == true){
            return type + " with " + enemyHealth + " hp.";
        } else {
            return "[DEAD] " + type;
        }
    }

    public void damage(int amount){
        enemyHealth = enemyHealth - amount;

        System.out.println("The "+ type + " has taken " + amount + " damage.");

        if(enemyHealth <= 0){
            isAlive = false;
            System.out.println("The " + type + " has died.");
            enemyCount--;
        }
    }

    public int attack(){
        return damage;
    }

    public boolean isAlive(){
        return isAlive;
    }

    static int count(){
        return enemyCount;
    }

    public int getHealth(){
        return enemyHealth;
    }

    public String getType(){
        return type;
    }

    public static int enemyCount(){
        return enemyCount;
    }

}