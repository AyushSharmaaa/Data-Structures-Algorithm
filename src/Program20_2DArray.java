import java.util.Scanner;
public class Program20_2DArray
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Row Size!!");
        int row = scanner.nextInt();
        System.out.println("Enter Column Size!!");
        int col =scanner.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter Elements!!");

        for (int i = 0; i<row; i++)
        {
            for (int j = 0; j<col; j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Matrix form");
        for (int i = 0; i<row; i++)
        {
            for (int j = 0; j<col; j++)
            {
                System.out.print(arr[i][j] + "  ");
            }

           System.out.println();
        }
    }
}
