package ch1;

public class GuitarSpec extends InstrumentSpec{

    private int numStrings;
    public GuitarSpec(Builder builder,String model,Type type,Wood backWood,Wood topWood,int numStrings){
       super(builder,model,type,backWood,topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings(){ return numStrings;}


    public boolean matches(InstrumentSpec checkMe){

        if(!super.matches(checkMe))
            return false;
        if (!(checkMe instanceof GuitarSpec))
            return false;
        GuitarSpec spec =(GuitarSpec) checkMe;
        if (numStrings != spec.getNumStrings())
            return false;

        return true;
    }




}
