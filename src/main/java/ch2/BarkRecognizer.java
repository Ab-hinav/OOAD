package ch2;

import java.util.ArrayList;

public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {

        ArrayList<Bark> allowedBarks = door.getAllowedBarks();
        for (Bark cBark : allowedBarks) {
            if(cBark.equals(bark)){
                System.out.println("Bark recognized");
                door.open();
                return;
            }
        }
        System.out.println("Bark not recognized");

    }

}
