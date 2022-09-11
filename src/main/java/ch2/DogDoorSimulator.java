package ch2;

public class DogDoorSimulator {

    public static void main (String []args) {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        System.out.println("Fido wants to go out");
        recognizer.recognize("woof");

        try {
            Thread.currentThread().sleep(1000);
        }catch (Exception e){
            System.out.println("ran into an exception");
        }

//        remote.pressButton();
        System.out.println("Fido wants to come in");
//        remote.pressButton();

        recognizer.recognize("woof");


    }



}
