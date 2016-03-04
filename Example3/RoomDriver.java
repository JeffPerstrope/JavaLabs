/**
 * Created by Jeff on 2/4/2016.
 */

import java.util.Scanner;

public class RoomDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Floor length: ");
        double userLength = keyboard.nextDouble();
        System.out.print("Floor width: ");
        double userWidth = keyboard.nextDouble();
        System.out.print("Cost per square inch: ");
        double userCost = keyboard.nextDouble();

        RoomDimension rd = new RoomDimension(userLength, userWidth);
        RoomCarpet rc = new RoomCarpet(rd, userCost);

        System.out.println();
        System.out.println(rd);
        System.out.println(rc);
    }
}
