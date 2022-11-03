package interfaces;

public class Car extends Vehicle implements CarInterface{
    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public String getCompany() {
        return null;
    }
}
