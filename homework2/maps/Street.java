package ija.ija2019.homework2.maps;


import ija.ija2019.homework2.mymaps.MyStreet;

public interface Street {

    java.lang.String getId();

    java.util.List<Coordinate> getCoordinates();

    Coordinate begin();

    Coordinate end();

    java.util.List<Stop> getStops();

    boolean addStop(Stop stop);

    boolean follows(Street s);

    static Street defaultStreet(java.lang.String id, Coordinate... coordinates){
        Coordinate LastCoordinate = null;
        for(Coordinate c: coordinates){
            if (LastCoordinate != null) {
                if (LastCoordinate.diffX(c) == 0 || LastCoordinate.diffY(c) == 0) {
                    LastCoordinate = c;

                }
                else return null;
            }
            else LastCoordinate = c;

        }

        return new MyStreet(id,coordinates);
    }

}
