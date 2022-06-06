public class Clothings extends Items{
    private int hp;


    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }


    public Clothings (String name, int value, double weight,int hp) {
        super(name, value, weight);
        this.hp=hp;
    }

    public Clothings() {
        super("unknown",0,0);
        this.hp=0;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("HP: " + hp);
        System.out.println("**********************************************");
    }
}

