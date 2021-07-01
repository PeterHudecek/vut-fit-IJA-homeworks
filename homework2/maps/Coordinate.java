package ija.ija2019.homework2.maps;


import java.util.Objects;

public class Coordinate{
    public int x;
    public int y;

    public static Coordinate create(int x, int y) {
        Coordinate newCoordinate = new Coordinate();
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

    public int diffX(Coordinate c){
        return (this.getX() - c.getX());
    }

    public int diffY(Coordinate c){ return (this.getY() - c.getY()); }

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

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
