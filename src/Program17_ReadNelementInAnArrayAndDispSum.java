import java.util.Scanner;
public class Program17_ReadNelementInAnArrayAndDispSum
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i<n ; i++)
        {
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j<n; j++)
        {
            sum = sum+arr[j];
            System.out.print(arr[j] +",");
        }
        System.out.println(" Sum = " + sum);
    }
}
