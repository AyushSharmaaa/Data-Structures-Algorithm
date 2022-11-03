import java.util.Scanner;

public class Program9_FactorialUsingRecursion
{
    static int fact = 1;
    public static int PrintFact(int n)
    {
        if (n>1)
        {
            fact = fact * n;
            n = PrintFact( n-1);
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(PrintFact(n));
    }
}
