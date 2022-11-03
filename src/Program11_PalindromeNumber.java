import  java.util.Scanner;
public class Program11_PalindromeNumber
{
    public  static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int rev = 0 , rem;

        while (temp!=0)
        {
            // Reverse a Number
            rem = temp % 10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if (n==rev)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }
    }
}
