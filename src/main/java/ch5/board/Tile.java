package ch5.board;

import ch5.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {

    private List units;

    public Tile() {
        units = new LinkedList();
    }

    protected void addUnit(Unit unit){
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    protected void removeUnits(){
        units.clear();
    }

    protected List getUnit(){
        return units;
    }

}
