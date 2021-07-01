package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Stop;
import vut.fit.ija.homework1.maps.Street;
import vut.fit.ija.homework1.maps.Coordinate;

public class MyStop implements Stop {
    private String StopID;
    private Coordinate StopCoordinate;
    private Street Street;

    public MyStop(String identificator){
        this.StopID = identificator;
        this.StopCoordinate = null;

    }
    public MyStop(String identificator, Coordinate coordinate){
        this.StopID = identificator;
        this.StopCoordinate = coordinate;

    }

    public String getId(){
        return this.StopID;
    }

    public Coordinate getCoordinate(){
        return this.StopCoordinate;
    }

    public void setStreet(Street s){
        this.Street = s;
    }


    public Street getStreet(){
        if(this.Street.equals(null)){
            return null;
        } else
            return this.Street;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        } else if(obj == null || this.getClass() != obj.getClass()){
            return false;
        } else {
            Stop stop = (Stop) obj;
            return this.StopID.equals(stop.getId());
        }
    }
}
