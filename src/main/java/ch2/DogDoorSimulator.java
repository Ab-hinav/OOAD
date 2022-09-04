package ch2;

public class DogDoorSimulator {

    public static void main (String []args) {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido wants to go out");
        remote.pressButton();
        System.out.println("Fido wants to come in");
        remote.pressButton();



    }



}
