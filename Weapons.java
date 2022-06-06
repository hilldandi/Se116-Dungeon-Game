public class Weapons extends Items {
    private int damage;
    private double range;
    private int weaponType;
                                    //DAMAGE CALC FONK. YAZILCAK
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage; }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
    public int getType() {
        return weaponType;
    }

    public void setType(int type) {
        this.weaponType= type;
    }

    public Weapons()
    {
        super("unknown",0,0);
        this.weaponType=0;
        this.damage=0;
        this.range=0;
    }

    public Weapons(String name, int value, double weight,int weaponType, int damage, double range) {
        super(name, value, weight);
        this.weaponType = weaponType;
        this.damage = damage;
        this.range = range;
    }}