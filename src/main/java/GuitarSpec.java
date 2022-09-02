public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;
    public GuitarSpec(Builder builder,String model,Type type,Wood backWood,Wood topWood,int numStrings){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public int getNumStrings(){ return numStrings;}
    public Builder getBuilder() {
        return builder;
    }
    public String getModel() {
        return model;
    }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }

    public boolean maches(GuitarSpec checkMe){

        if(this.getBuilder()!=checkMe.getBuilder())
            return false;
        if(!(model!=null) && (!model.equals("")) && (!model.equals(checkMe.getModel())))
            return false;
        if(type!=checkMe.getType())
            return false;
        if(numStrings!= checkMe.getNumStrings())
            return false;
        if(backWood!=checkMe.getBackWood())
            return false;
        if(topWood!=checkMe.getTopWood())
            return false;

        return true;
    }




}
