/**
 * Created by Jeff on 2/22/2016.
 */
 
 //Polymorphism: Lines 9 & 10
 
public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();

        v1.accelerate();
        v1.accelerate();
        v1.accelerate();

        v2.accelerate();
        v2.accelerate();
        v2.accelerate();
        v2.accelerate();
        v2.accelerate();

        System.out.printf("Car: %d mph", v1.getSpeed());
        System.out.printf("\nTruck: %d mph", v2.getSpeed());
    }
}
