import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory(){
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type,Wood backWood,Wood topWood) {
        Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator<Guitar> i = guitars.iterator();i.hasNext();){
            Guitar guitar = i.next();
            if(guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar){
        List<Guitar>  guitars = new LinkedList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();

            Builder builder =  searchGuitar.getBuilder();
            if ((builder!=null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
                continue;

            Type type =  searchGuitar.getType();
            if ((type!=null) && (!type.equals("")) && (!type.equals(guitar.getType())))
                continue;

            Wood backWood =  searchGuitar.getBackWood();
            if ((backWood!=null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
                continue;

            Wood topWood =  searchGuitar.getTopWood();
            if ((topWood!=null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
                continue;


            guitars.add(guitar);
        }
        return guitars;
    }



}
