package vehicle;

public abstract class Vehicle
{
    protected String color;
    private int maxSpeed;

//    public Vehicle(int maxSpeed){
//        this.maxSpeed=maxSpeed;
//        System.out.println("VC");
//    }

    public abstract boolean isMoterized();

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void print()
    {
        System.out.println("Vehicle Color : " + color);
        System.out.println("Vehicle Speed : " + maxSpeed);
    }
}
