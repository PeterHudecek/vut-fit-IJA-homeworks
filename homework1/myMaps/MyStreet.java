package vut.fit.ija.homework1.myMaps;

import java.util.ArrayList;
import java.util.List;
import vut.fit.ija.homework1.maps.Stop;
import vut.fit.ija.homework1.maps.Street;
import vut.fit.ija.homework1.maps.Coordinate;

public class MyStreet implements Street{
    private String StreetID;
    private List<Coordinate> StreetCoordinates;
    private List<Stop> StopsOnStreet;

    public MyStreet(String ID,Coordinate coordinate1,Coordinate coordinate2){
        this.StreetCoordinates = new ArrayList<>();
        this.StopsOnStreet = new ArrayList<>();
        this.StreetCoordinates.add(coordinate1);
        this.StreetCoordinates.add(coordinate2);
        this.StreetID = ID;
    }

    public String getId(){
        return this.StreetID;
    }

    public List<Coordinate> getCoordinates(){
        return this.StreetCoordinates;
    }

    public List<Stop> getStops(){
        return this.StopsOnStreet;
    }

    public void addStop(Stop stop){
        stop.setStreet(this);
        this.StopsOnStreet.add(stop);
    }
}
