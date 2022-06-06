import java.util.Random;

public class ClothingRandom {

    ClothingList clothings = new ClothingList();

    public Clothings ClothingRandom(){

        Random i = new Random();
        int x = i.nextInt(6);

        switch (x){
            case 0 :
                clothings.LightArmor();
                return clothings.LightArmor();

            case 1:
                clothings.LeatherArmor();
                return clothings.LeatherArmor();

            case 2:
                clothings.Culet();
                return clothings.Culet();

            case 3:
                clothings.ChainMail();
                return clothings.ChainMail();

            case 4:
                clothings.Jupon();
                return clothings.Jupon();

            case 5:
                clothings.Cuiras();
                return clothings.Cuiras();


        }
        return null;

    }

}
