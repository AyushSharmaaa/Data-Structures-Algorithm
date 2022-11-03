package vehicle;

public class Car extends Vehicle
{
    int numGares;
    boolean isConvertable;

    @Override
    public boolean isMoterized() {
        return false;
    }

    public void print()
    {
      // super.print();
        System.out.println("Car numGares : " + numGares);
        System.out.println("Car isConvertable : " + isConvertable);
    }
}
