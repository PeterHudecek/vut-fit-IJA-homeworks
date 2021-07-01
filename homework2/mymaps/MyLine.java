package ija.ija2019.homework2.mymaps;

import ija.ija2019.homework2.maps.Stop;
import ija.ija2019.homework2.maps.Street;
import ija.ija2019.homework2.maps.Line;

import java.util.AbstractMap;
import java.util.ArrayList;

public class MyLine implements Line{
    java.lang.String LinkID;
   private java.util.List<Stop> LineStops;
   private java.util.List<Street> LineStreets;
   private java.util.List<java.util.AbstractMap.SimpleImmutableEntry<Street,Stop>> TableList;


    public MyLine(java.lang.String id){
        this.LinkID  = id;
        this.LineStops = new ArrayList<>();
        this.LineStreets = new ArrayList<>();
        this.TableList = new ArrayList<>();
    }
    public boolean addStop(Stop stop){
        if(LineStops.size() == 0){
            LineStops.add(stop);
            LineStreets.add(stop.getStreet());
            TableList.add(new AbstractMap.SimpleImmutableEntry<>(stop.getStreet(),stop));
            return true;
        }
        else if(LineStreets.get(LineStreets.size() - 1).follows(stop.getStreet())){
            LineStops.add(stop);
            LineStreets.add(stop.getStreet());
            TableList.add(new AbstractMap.SimpleImmutableEntry<>(stop.getStreet(),stop));
            return true;
        }
        else return false;
    }

    public boolean addStreet(Street street){
        if(LineStops.size() == 0){
            return false;
        }
        else if(LineStreets.get(LineStreets.size() - 1).follows(street)){
            LineStreets.add(street);
            TableList.add(new AbstractMap.SimpleImmutableEntry<>(street,null));
            return true;
        }
        else return false;
    }

    public java.util.List<java.util.AbstractMap.SimpleImmutableEntry<Street,Stop>> getRoute(){
        return java.util.Collections.unmodifiableList(TableList);
    }


}
