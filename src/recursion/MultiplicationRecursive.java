package recursion;

public class MultiplicationRecursive
{
    public static int multiplyTwoIntegers(int m, int n){
       if (n==0)
       {
           return 0;
       }
       int ans = multiplyTwoIntegers(m,n-1);
       return ans+m;
    }
    public static void main(String args[])
    {
        System.out.println(multiplyTwoIntegers(3,5));
    }
}
