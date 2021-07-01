package ija.ija2019.homework2.mymaps;

import ija.ija2019.homework2.maps.Coordinate;
import ija.ija2019.homework2.maps.Stop;
import ija.ija2019.homework2.maps.Street;

public class MyStop implements Stop {
    private java.lang.String StopID;
    private Coordinate StopCoordinate;
    private Street Street;

    public MyStop(java.lang.String id, Coordinate c){
        this.StopID = id;
        this.StopCoordinate = c;
        this.Street = null;
    }

    public String getId() {
        return this.StopID;
    }


    public Coordinate getCoordinate() {
        if(this.StopCoordinate == null){
            return null;
        } else
            return this.StopCoordinate;
    }



    public void setStreet(Street s) {
        this.Street = s;
    }

    public Street getStreet() {
        if(this.Street == null){
            return null;
        } else
            return this.Street;
    }

    @Override
    public String toString() {
        return "stop(" + getId() +")";
    }
}
