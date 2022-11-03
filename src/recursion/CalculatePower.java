package recursion;

public class CalculatePower
{
    public static int power(int x , int y)
    {
        if (y==0)
        {
            return 1;
        }
        return power(x , y-1) * x;
    }
    public static void main(String args[])
    {
        int x = 2 , y = 3;
        System.out.println(power(x , y));
    }
}

