import  java.util.Scanner;
public class Program14_ReverseOfNum
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int rem , rev = 0;

        while (a>0)
        {
            rem = a % 10;
            a = a/10;
            rev = rev * 10 + rem;
        }
        System.out.println("Reverse = " + rev);

    }
}
