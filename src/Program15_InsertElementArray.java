import java.util.Scanner;
public class Program15_InsertElementArray
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int size = scanner.nextInt();
        int a[] = new int[size];

        for (int i = 0; i<size; i++)
        {
            a[i] = scanner.nextInt();
            System.out.println(a[i]);
        }
    }
}
