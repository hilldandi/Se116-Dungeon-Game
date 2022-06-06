import java.util.ArrayList;

public class ClothingList {

    ArrayList<Items> ClothingList = new ArrayList<>();

    public Clothings LightArmor() {
        Clothings LightArmor = new Clothings("Light Armor", 11, 1.1, 2);
        ClothingList.add(LightArmor);
        return LightArmor;
    }

    public Clothings LeatherArmor() {
        Clothings LeatherArmor = new Clothings("Leather Armor", 15, 3.0, 4);
        ClothingList.add(LeatherArmor);
        return LeatherArmor;
    }

    public Clothings Culet() {
        Clothings Culet = new Clothings(" Culet", 4, 8.0, 1);
        ClothingList.add(Culet);
        return Culet;
    }

    public Clothings ChainMail() {
        Clothings ChainMail = new Clothings("ChainMail", 2, 9.0, 11);
        ClothingList.add(ChainMail);
        return ChainMail;
    }

    public Clothings Jupon() {
        Clothings Jupon = new Clothings("Jupon", 1, 2.0, 7);
        ClothingList.add(Jupon);
        return Jupon;
    }

    public Clothings Cuiras() {
        Clothings Cuiras = new Clothings("Cuiras", 5, 10.2, 6);
        ClothingList.add(Cuiras);
        return Cuiras;
    }

}







