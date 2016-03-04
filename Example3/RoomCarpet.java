/**
 * Created by Jeff on 2/4/2016.
 */

import java.text.DecimalFormat;

public class RoomCarpet {

    DecimalFormat df = new DecimalFormat("#,##0.00");

    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension s, double c)
    {
        size = s;
        carpetCost = c;
    }

    public double getTotalCost()
    {
        return size.getArea() * carpetCost;
    }

    public String toString() {
        return "Total cost: $" + df.format(getTotalCost());
    }
}
