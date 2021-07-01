package vut.fit.ija.homework1.myMaps;

import java.util.ArrayList;
import java.util.List;
import vut.fit.ija.homework1.maps.Street;
import vut.fit.ija.homework1.maps.StreetMap;

public class MyStreetMap implements StreetMap{
    private List<Street> StreetsOnMap;

    public MyStreetMap(){
        this.StreetsOnMap = new ArrayList<>();
    }

    public void addStreet(Street s){
        this.StreetsOnMap.add(s);
    }
    
    public Street getStreet(String id){
        for(Street street : this.StreetsOnMap){
            if(street.getId().equals(id))
                return street;
        }
        return null;
    }
}
