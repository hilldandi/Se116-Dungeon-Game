import java.util.ArrayList;

public class WeaponList {
    ArrayList<Items> MyWeaponsList = new ArrayList<>();

    public Weapons ShortSword() {
        Weapons ShortSword = new Weapons("ShortSword", 13, 3, 1, 2, 4);
        MyWeaponsList.add(ShortSword);
        return ShortSword;
    }

    public Weapons LongSword() {
        Weapons LongSword = new Weapons("LongSword", 13, 5, 1, 4, 6);
        MyWeaponsList.add(LongSword);
        return LongSword;
    }

    public Weapons Skimater() {
        Weapons Skimater = new Weapons("Skimater", 10, 4, 1, 5, 2);
        MyWeaponsList.add(Skimater);
        return Skimater;
    }


    public Weapons Buckler() {
        Weapons Buckler = new Weapons("Buckler", 10, 1.7, 2, 10, 2);
        MyWeaponsList.add(Buckler);
        return Buckler;
    }


    public Weapons SmallBuckler() {
        Weapons SmallBuckler = new Weapons("SmallBuckler", 12, 2.5, 2, 14, 5);
        MyWeaponsList.add(SmallBuckler);
        return SmallBuckler;
    }


    public Weapons TowerShield() {
        Weapons TowerShield = new Weapons("TowerShield", 9, 4.5, 2, 2, 4);
        MyWeaponsList.add(TowerShield);
        return TowerShield;
    }


    public Weapons BoneWand() {
        Weapons BoneWand = new Weapons("BoneWand", 15, 3, 3, 1, 2);
        MyWeaponsList.add(BoneWand);
        return BoneWand;
    }


    public Weapons WoodWand() {
        Weapons WoodWand = new Weapons("WoodWand", 11, 4.2, 3, 4, 6);
        MyWeaponsList.add(WoodWand);
        return WoodWand;
    }
}






















