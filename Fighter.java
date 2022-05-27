package Others;

public class Fighter extends Character {

    //private int seateight;
    private int strength,intelligence,vitality;
    private double hP;
    public Fighter() {
        super.setIntelligence(GameLogic.rand.nextInt(5)+6);
        super.setStrength(GameLogic.rand.nextInt(5)+1);
        super.setVitality(GameLogic.rand.nextInt(5)+3);
        //hP=0.7*vitality+0.2*strength+0.1*intelligence;
        //hp yazdırt burada
        //eğer herhangi bir ekstra özellik tanımlamak stersen soonradan örnek gibi yap
        //this.seatHeight=seatHeight;
        System.out.println("Fighter generated. Strength:" + getStrength()+ " Vitality:"+ getVitality() + " Intelligence:" +getIntelligence()+ " HP:" + gethP());
    }
    public void attack(Character character){

    }
}
