package ch5;

import java.util.List;
import java.util.Map;

public class Unit {

    private int id;
    private String type;
    private String name;
    private List weapons;
    private Map properties;

    public Unit(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addWeapon(Weapon weapon){
     if(weapons == null)
         weapons = new java.util.ArrayList();

        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperties(String property,Object value){
        if(properties == null)
            properties = new java.util.HashMap();

        properties.put(property,value);
    }

    public Object getProperty(String property){
       if (properties == null) {
        throw new RuntimeException("No properties set");

       }
       Object value = properties.get(property);
       if(value == null)
           throw new RuntimeException("No property found for " + property);
       else
           return value;

    }


}
