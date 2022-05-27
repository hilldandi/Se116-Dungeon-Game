package Others;

public class Healer extends Character {
    private int strength,intelligence,vitality;
    private double hP;
    public Healer() {
        super.setIntelligence(GameLogic.rand.nextInt(5)+1);
        super.setStrength(GameLogic.rand.nextInt(5)+3);
        super.setVitality(GameLogic.rand.nextInt(5)+6);
        //hP=0.7*vitality+0.2*strength+0.1*intelligence;
        //hp yazdırt burada
        //eğer herhangi bir ekstra özellik tanımlamak stersen soonradan örnek gibi yap
        //this.seatHeight=seatHeight;
        System.out.println("Healer generated. Strength:" + getStrength()+ " Vitality:"+ getVitality() + " Intelligence:" +getIntelligence()+ " HP:" + gethP());
    }
}
