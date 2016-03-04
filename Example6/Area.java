/**
 * Created by Jeff on 2/3/2016.
 */
public class Area {

    public static double shapeArea(double r)
    {
        double area = Math.PI * (r * r);
        return area;
    }
    public static double shapeArea(int w, int h)
    {
        double area = w * h;
        return area;
    }
    public static double shapeArea(double r, double h)
    {
        double area = Math.PI * (r * r) * h;
        return area;
    }

}
