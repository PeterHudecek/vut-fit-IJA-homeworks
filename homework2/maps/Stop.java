package ija.ija2019.homework2.maps;


import ija.ija2019.homework2.mymaps.MyStop;

public interface Stop {

    java.lang.String getId();

    Coordinate getCoordinate();

    void setStreet(Street s);

    Street getStreet();

    static Stop defaultStop(java.lang.String id, Coordinate c){
        return new MyStop(id,c);
    }



}
