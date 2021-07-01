package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Coordinate;

public class MyCoordinate implements Coordinate{
    private int x;
    private int y;

    public static MyCoordinate create(int x, int y) {
        MyCoordinate newCoordinate = new MyCoordinate();
        if (x < 0 || y < 0){
            return null;
        } else {
            newCoordinate.x = x;
            newCoordinate.y = y;
            return newCoordinate;
        }
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }else if(this.getClass() != obj.getClass() || obj == null){
            return false;
        }
        else{
            Coordinate c = (Coordinate) obj;
            return c.getX() == this.x && c.getY() == this.y;
        }


    }
}
