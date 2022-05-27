package Others;

public class Character {

    int type;
    private int strength,vitality,intelligence;
    private double hP;
    private double inventoryWeight;
    boolean isWeaponWielded=false;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void sethP(int vitality,int  strength,int intelligence) {
        this.hP=hP;
    }
    public double gethP() {
        return hP;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void attack() {//action requires a weapon to be wielded. It also requires a specific target.characters can attack other characters too
        //if(!isWeaponWielded){
          //  System.out.println("You need to wield a weapon to attack");
        //}
        //else{
          //  character.hP-=strength;
        //}
    }
    public void specialAction(){//to use the special action of their weapon requires a specific target, including the character itself

    }
    public void pick(){//picks up an item on the ground Requires a specific target. The item is stored in the character's inventory

    }
    public void wield(){//wield a weapon from its inventory or from the ground. Requires a specific targe

    }
    public void wear(){//wear armor from its inventory or from the ground

    }
    public void examine(){ //examine an item to learn its attributes

    }
    public void carryInventory(){

    }
    public void listInventory(){

    }
    public void round(){

    }


}
