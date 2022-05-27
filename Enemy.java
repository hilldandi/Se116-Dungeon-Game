package Others;

public class Enemy extends Character {
    private int strength,intelligence,vitality;
    private double hP;
    public Enemy() {
        super.setIntelligence(GameLogic.rand.nextInt(5) + 1);
        super.setStrength(GameLogic.rand.nextInt(5) + 1);
        super.setVitality(GameLogic.rand.nextInt(5) + 1);
        //hP=0.7*vitality+0.2*strength+0.1*intelligence;
        //hp yazdırt burada
        //eğer herhangi bir ekstra özellik tanımlamak stersen soonradan örnek gibi yap
        //this.seatHeight=seatHeight;
    }
    }
