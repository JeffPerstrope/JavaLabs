/**
 * Created by Jeff on 2/4/2016.
 */
public class RoomDimension {

    private double length, width;

    public RoomDimension(double l, double w)
    {
        length = l;
        width = w;
    }

    public double getArea()
    {
        return length * width;
    }

    public String toString() {
        return "Length: " + length + "\nWidth: " + width + "\nArea: " + getArea();
    }
}
