import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args){
        //set up inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("",0,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
        List<Guitar> guitars = inventory.search(whatErinLikes);

        if(!guitars.isEmpty()){
            System.out.println("Erin"+guitars);
        }else{
            System.out.println("Sorry, Erin, we have nothing for u");
        }


    }


    private static void initializeInventory(Inventory inventory){
        // add guitars to inventory
    }


}
