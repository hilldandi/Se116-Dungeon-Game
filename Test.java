package Others;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isCont = true;
        System.out.println("CANNON FODDER");
        System.out.println("Welcome advanturer!");
        //leveli gir ve sayısını çıktı aldır
        //levele gerekli güncellemeleri yaptır

        while (isCont) {
            System.out.println("Press\n1-Start the game \n2-Player Stats \n3-Close the game");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Your game is started:");
                for (int i = 0; i < 3; i++) {

                    if (i == 0) {
                        Fighter f = new Fighter();
                        GameLogic.characters.add(f);
                    } else if (i == 1) {
                        GameLogic.characters.add(new Healer());
                    } else if (i == 2) {
                        GameLogic.characters.add(new Tank());
                    }
                }break;

                }
            //else if (choice==2)

            else if (choice == 3) {System.out.println("Your game is closing now...");
                isCont = false;
            }
            else {System.out.println("Please enter a valid number...");}}
            }
        }

