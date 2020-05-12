package rpg;

public class Enemy {
    
    static int enemyCount = 0;
    int enemyHealth;
    String type;
    boolean isAlive;
    int damage;
    
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

    public void damage(int amount){
        enemyHealth = enemyHealth - amount;

        System.out.println("The "+ type + " has taken " + amount + " damage.");

        if(enemyHealth <= 0){
            isAlive = false;
            System.out.println("The " + type + " has died.");
        }
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

}