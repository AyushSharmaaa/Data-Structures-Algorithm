public class Program8_FibonacciSeries
{
    public static void main(String args[])
    {
        int a = 0 , b = 1;
        int fib;

        for (int i = 1 ; i<=10 ; i++)
        {
            fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
    }
}
