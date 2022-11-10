package ch10.subway;

public class Station {

    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Station ){
            Station s = (Station) o;
            return s.getName().equalsIgnoreCase(this.getName());
        }
        return false;
    }

    public int hashCode() {
        return name.toLowerCase().hashCode();
    }



}
