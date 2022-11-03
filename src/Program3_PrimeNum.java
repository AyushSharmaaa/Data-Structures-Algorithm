import java.util.Scanner;
public class Program3_PrimeNum
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp=0;
        for (int i = 2 ; i<n ; i++)
        {
            if (n%i==0)
            {
               temp++;
            }
        }
        if (temp>0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}
