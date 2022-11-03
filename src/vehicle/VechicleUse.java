package vehicle;

import vehical_temp.Truck;
public class VechicleUse
{
    public static void main(String args[])
    {
       // Vehicle v = new Vehicle();
        //v.setMaxSpeed(100);
       // v.print();


       // Car c = new Car();
       // c.numGares = 10;
        //c.color = "Black";
        //c.setMaxSpeed(280);
        //c.print();
        //System.out.print("ABC");
        //System.out.print("abc");

        Vehicle v = new Car();
        Vehicle v1 = new Truck();
        v1.isMoterized();
        v1.print();
        v.isMoterized();
        v.print();
    }
}
