package rpg;

public class Npc {
    
    String name;
    char gender;
    boolean hasKeyA;
    boolean hasKeyB;
    boolean hasKeyC;

    public Npc(String npcName, char npcGender){
        name = npcName;
        gender = npcGender;
    }

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

    public String getName(){
        return name;
    }
    
    public char getGender(){
        return gender;
    }

    public boolean hasKey(){
        if(hasKeyA || hasKeyB || hasKeyC){
            return true;
        } else {
            return false;
        }
    }

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

}