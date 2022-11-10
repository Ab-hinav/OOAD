package ch10.subway;

import java.util.LinkedList;
import java.util.List;

public class Subway {

    private List <Station> stations;
    private List <Connection> connections;

    public Subway(){
        stations = new LinkedList<>();
        connections = new LinkedList<>();
    }

    public boolean hasStation(String stationName){
        return stations.contains(new Station(stationName));
    }

    public void addStation(String stationName) {
        if (!hasStation(stationName)) {
            stations.add(new Station(stationName));
        }
    }

    public void addConnection(String station1, String station2, String lineName) {
        if ((this.hasStation(station1)) && (this.hasStation(station2))) {
            connections.add(new Connection(new Station(station1), new Station(station2), lineName));
        }else {
            throw new RuntimeException("Invalid connection!");
        }
    }


}
