import java.util.*;
public class Program19_StringArrayCharArray
{
   public static void main(String args[])
   {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the Size of String");
       int n = scanner.nextInt();
       String a[] = new String[n];

       for (int i = 0; i<n; i++)
       {
           a[i] = scanner.nextLine();
       }
       for (int j = 0; j<a.length; j++)
       {
           System.out.println(a[j]);
       }
   }
}
