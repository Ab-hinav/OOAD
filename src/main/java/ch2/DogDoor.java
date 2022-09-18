package ch2;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private ArrayList<Bark> allowedBarks;

    public DogDoor() {
        this.open = false;
        allowedBarks = new ArrayList<Bark>();
    }

    public void addAllowedBarks(Bark bark){
        allowedBarks.add(bark);
    }

    public void open() {
        System.out.println("The door is now open!");
        this.open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        },5000);

    }

    public void close() {
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public ArrayList<Bark> getAllowedBarks(){
        return allowedBarks;
    }


}
