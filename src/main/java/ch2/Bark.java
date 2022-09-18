package ch2;

public class Bark {

    private String sound;

    public Bark(String bark){
        this.sound = bark;
    }

    public String getSound() {
        return sound;
    }

    public boolean equals(Object otherBark){

        if(otherBark instanceof Bark){
            Bark barkOther = (Bark)otherBark;
            if(this.sound.equalsIgnoreCase(barkOther.getSound())) {
                return true;
            }

        }
        return false;
    }



}
