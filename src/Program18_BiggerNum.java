import  java.util.Scanner;
public class Program18_BiggerNum
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenght Of Array");
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i<n ; i++)
        {
            a[i] = scanner.nextInt();
        }
        int m = a[0];
        for (int j = 0 ; j<n ; j++)
        {
            if (a[j]>m)
            {
                m = a[j];
            }
        }
        System.out.println("Bigger Number is - " +m);
    }
}
