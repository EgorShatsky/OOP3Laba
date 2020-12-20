import java.util.Objects;
/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Создает новое местоположение с координатами (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    public boolean equals(Object obj){ //Добавил сам
        if (obj instanceof Location){ // проверка создан ли объект на базе Location
            Location location=(Location) obj;
            if (xCoord== location.xCoord&&yCoord==location.yCoord){ // Сравнение координат
                return true;
            }
        }
        return false;
    }

    public int hashCode(){ //Добавил сам
        int result=20;

        result=16*result + (xCoord*13);
        result=22*result + (yCoord*11);

        return result;

    }

}