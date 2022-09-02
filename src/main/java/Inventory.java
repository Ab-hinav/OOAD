import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory(){
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type,Wood backWood,Wood topWood) {
        GuitarSpec guitarSpec = new GuitarSpec(builder,model,type,backWood,topWood,8);
        Guitar guitar = new Guitar(serialNumber,price,guitarSpec);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator<Guitar> i = guitars.iterator();i.hasNext();){
            Guitar guitar = i.next();
            if(guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitarSpec){
        List<Guitar>  guitars = new LinkedList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();
            GuitarSpec guitarSpec = guitar.getGuitarSpec();

            if(guitarSpec.maches(searchGuitarSpec))
                guitars.add(guitar);
        }
        return guitars;
    }



}
