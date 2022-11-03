package recursion;
public class NumberOfDigits
{
    /* Sample Input 1 : 156 ------- Sample Output 1 : 3
       Sample Input 2 : 7  -------- Sample Output 2 : 1 */
    public static int count(int n)
    {
        if (n==0)
        {
            return 0;
        }
     int smallAns= count(n/10);
        return smallAns + 1;
    }
    public static void main(String args[])
    {
        int n = 157;
        System.out.println(count(n));
    }
}
