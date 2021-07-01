package ija.ija2019.homework2.maps;

import ija.ija2019.homework2.mymaps.MyLine;

public interface Line {

    boolean addStop(Stop stop);

    boolean addStreet(Street street);

    java.util.List<java.util.AbstractMap.SimpleImmutableEntry<Street,Stop>> getRoute();

    static Line defaultLine(java.lang.String id){
        return new MyLine(id);
    }
}
