import java.util.Scanner;
public class Program13_SumOfDigitOfNum
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number!!");
        int a = scanner.nextInt() , Rem , sum = 0;

        while (a>0)
        {
            Rem = a%10;
            a = a/10;
            sum = sum + Rem;
        }
        System.out.println("Sum = " + sum);
    }
}
