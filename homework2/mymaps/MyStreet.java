package ija.ija2019.homework2.mymaps;

import ija.ija2019.homework2.maps.Coordinate;
import ija.ija2019.homework2.maps.Stop;
import ija.ija2019.homework2.maps.Street;

import java.util.ArrayList;

public class MyStreet implements Street {
    java.lang.String StreetID;
    java.util.List<Coordinate> Coordinates;
    java.util.List<Stop> Stops;

    public MyStreet(java.lang.String id, Coordinate... coordinates){
        this.StreetID = id;
        this.Coordinates = new ArrayList<>();
        this.Stops = new ArrayList<>();
        for(Coordinate c: coordinates){
            Coordinates.add(c);
        }
    }

    public java.lang.String getId(){
        return this.StreetID;
    }

    public java.util.List<Coordinate> getCoordinates(){
        return this.Coordinates;
    }

    public Coordinate begin(){
        return Coordinates.get(0);
    }

    public Coordinate end(){
        return Coordinates.get(Coordinates.size() - 1);
    }

    public java.util.List<Stop> getStops(){
        return Stops;
    }

    public boolean addStop(Stop stop){
        Coordinate LastCoordinate = null;
       for(Coordinate c: this.Coordinates){
            if(LastCoordinate != null){
                if(((LastCoordinate.diffX(stop.getCoordinate()) == 0 &&
                        LastCoordinate.getY() <= stop.getCoordinate().getY() && c.diffX(stop.getCoordinate()) == 0 &&
                        stop.getCoordinate().getY() <= c.getY()) ||
                        (LastCoordinate.diffY(stop.getCoordinate()) == 0 &&
                                LastCoordinate.getX() <= stop.getCoordinate().getX() &&
                                c.diffY(stop.getCoordinate()) == 0 && stop.getCoordinate().getX() <= c.getX())) ||
                ((LastCoordinate.diffX(stop.getCoordinate()) == 0 &&
                        LastCoordinate.getY() >= stop.getCoordinate().getY() && c.diffX(stop.getCoordinate()) == 0 &&
                        stop.getCoordinate().getY() >= c.getY()) ||
                        (LastCoordinate.diffY(stop.getCoordinate()) == 0 &&
                                LastCoordinate.getX() >= stop.getCoordinate().getX() &&
                                c.diffY(stop.getCoordinate()) == 0 && stop.getCoordinate().getX() >= c.getX()))){
                    stop.setStreet(this);
                    Stops.add(stop);
                    return true;
                }
            }
           LastCoordinate = c;
       }
       return false;
    }

    public boolean follows(Street s){
        return (this.begin().equals(s.end()) || this.end().equals(s.begin()) ||
                this.begin().equals(s.begin()) || this.end().equals(s.end()));
    }

}
