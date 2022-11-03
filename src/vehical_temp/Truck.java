package vehical_temp;

import vehicle.Vehicle;
public class Truck extends Vehicle
{
    int weightCap;

    @Override
    public boolean isMoterized() {
        return false;
    }

    public void print()
    {
        System.out.println("Truck cap : " +weightCap);
        System.out.println("Truck color : " + color);

    }
}
