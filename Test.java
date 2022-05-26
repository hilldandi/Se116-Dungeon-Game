public class Test {
    public static void main(String[] args) {

        int round = 0;

        String input =GameLogic.input.nextLine();
        String action =GameLogic.takeAction(input);
        for (int i = 0; i <3 ; i++) {
            int rand = GameLogic.rand.nextInt(3);
            if(rand==0){
                GameLogic.characters.add(new Fighter());
            }
            else if(rand==1){
                GameLogic.characters.add(new Healer());
            }
            else if(rand==2){
                GameLogic.characters.add(new Tank());
            }
        }
        for (int i = 0; i <GameLogic.characters.size() ; i++) {
            System.out.println(GameLogic.characters.get(i).getType());
        }
        Character character = GameLogic.chooseCharacter(input);

        System.out.println(character.getType());

        //add while loop here nested while loop
        while (true){
            if(GameLogic.input.nextLine().equals("")){

            }
            // menu
            input =GameLogic.input.nextLine();
            Character c = GameLogic.chooseCharacter(input);
            String action1 = GameLogic.takeAction(input);
            String target = GameLogic.takeTarget(input);
            if(action1.equals("attack")){
                //c.attack(target);
            }
            else if(action1.equals("specialAction")){
                c.specialAction();
            }
            else if(action1.equals("pick")){
                c.pick();
            }
            else if(action1.equals("wear")){
                c.wear();
            }
            else if(action1.equals("wield")){
                c.wield();
            }
            else if(action1.equals("examine")){
                c.examine();
            }
            else if(action1.equals("carryInventory")){
                c.carryInventory();
            }
            else if(action1.equals("listInventory")){
                c.listInventory();
            }
            else if(action1.equals("round")){
                c.round();
            }
            else{
                System.out.println("Invalid input");
            }

            round++;
        }




    }
}
