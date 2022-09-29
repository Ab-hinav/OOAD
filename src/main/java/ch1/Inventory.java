package ch1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Instrument> inventory;

    public Inventory(){
        inventory = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber,price,(GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber,price,(MandolinSpec) spec);
        }
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber){
        for(Iterator i = inventory.iterator();i.hasNext();){
            Instrument instrument = (Instrument) i.next();
            if(instrument.getSerialNumber().equals(serialNumber))
                return instrument;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitarSpec){
        List<Guitar>  guitars = new LinkedList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();
            GuitarSpec guitarSpec = (GuitarSpec) guitar.getSpec();

            if(guitarSpec.matches(searchGuitarSpec))
                guitars.add(guitar);
        }
        return guitars;
    }

    public List search(MandolinSpec searchSpec){
        List matchingMandolins = new LinkedList();
        for (Iterator i = inventory.iterator();i.hasNext();){
            Mandolin mandolin = (Mandolin) i.next();
            if (mandolin.getSpec().matches(searchSpec))
                matchingMandolins.add(mandolin);
        }
        return matchingMandolins;
    }


}
