public class Fighter extends Character {
    int  type = 1 ;

    private int strength,intelligence,vitality;

    public Fighter(){
        strength  =GameLogic.rand.nextInt(5)+6;
        vitality  =GameLogic.rand.nextInt(5)+3;
        intelligence  =GameLogic.rand.nextInt(5)+1;
    }

    @Override
    public int getType() {
        return type;
    }



    @Override
    void specialAction() {
        super.specialAction();
    }

    @Override
    void pick() {
        super.pick();
    }

    @Override
    void wield() {
        super.wield();
    }

    @Override
    void wear() {
        super.wear();
    }

    @Override
    void examine() {
        super.examine();
    }

    @Override
    void carryInventory() {
        super.carryInventory();
    }

    @Override
    void listInventory() {
        super.listInventory();
    }

    @Override
    public void round() {
        super.round();
    }
}
