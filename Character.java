public class Character {
    int type = 0;



    double hP=0.0;
    int strength,vitality,intelligence;
    boolean isWeaponWielded=false;
    public int getType() {
        return type;
    }

    void attack(Character character){//action requires a weapon to be wielded. It also requires a specific target.characters can attack other characters too
        if(!isWeaponWielded){
            System.out.println("You need to wield a weapon to attack");
        }
        else{
            character.hP-=strength;
        }

    }
    void specialAction(){//to use the special action of their weapon requires a specific target, including the character itself

    }
    void pick(){//picks up an item on the ground Requires a specific target. The item is stored in the character's inventory

    }
    void wield(){//wield a weapon from its inventory or from the ground. Requires a specific targe

    }
    void wear(){//wear armor from its inventory or from the ground

    }
    void examine(){ //examine an item to learn its attributes


    }
    void carryInventory(){

    }
    void listInventory(){

    }
    public void round(){}
}
