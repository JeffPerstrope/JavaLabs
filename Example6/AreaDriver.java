/**
 * Created by Jeff on 2/3/2016.
 */
 
 //Using static members: Lines 9, 10, & 11
 
public class AreaDriver {
    public static void main(String[] args) {
        System.out.printf("Circle area: %.2f\n", Area.shapeArea(5.0));
        System.out.printf("Rectangle area: %.2f\n", Area.shapeArea(7, 7));
        System.out.printf("Cylinder area: %.2f\n", Area.shapeArea(2.0, 4.0));
    }
}
