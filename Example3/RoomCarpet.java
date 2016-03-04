/**
 * Created by Jeff on 2/4/2016.
 */
 
 //Instance fields: Lines 16-17
 //Instance methods: Line 26
 //Override toString method: Line 31
 //Constructor: Line 20
 //Aggregation: Line 17

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
