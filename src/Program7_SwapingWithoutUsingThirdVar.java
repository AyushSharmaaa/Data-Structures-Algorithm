public class Program7_SwapingWithoutUsingThirdVar
{
    public static void main(String args[])
    {
        int X = 10 , Y = 50;
        X = X + Y; // 30
        Y = X - Y; // 20
        X = X - Y;// 10

        System.out.println(X + " " + Y);

    }
}
