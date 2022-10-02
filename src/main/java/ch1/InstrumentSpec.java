package ch1;

import java.util.HashMap;
import java.util.Map;

public  class InstrumentSpec {

    private Map properties;

    public InstrumentSpec(Map properties) {
        if (properties == null)
            this.properties = new HashMap();
        else
            this.properties = new HashMap(properties);
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Object key : otherSpec.getProperties().keySet()) {
            if (!properties.get(key).equals(otherSpec.getProperty((String) key)))
                return false;
        }
        return true;
    }




}
