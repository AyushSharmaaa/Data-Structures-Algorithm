package recursion;
public class PrintNumbers
{
      /*Sample Input : 6
        Sample Output : 1 2 3 4 5 6 */
    public static void print(int n)
    {
        if (n==0)
        {
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }
   public static void main(String args[])
   {
       int n = 4;
       print(n);
   }
}
