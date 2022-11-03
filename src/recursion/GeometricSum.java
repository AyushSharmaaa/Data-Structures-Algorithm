package recursion;

public class GeometricSum
{
    /*Given k, find the geometric sum i.e.
     1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)*/

    public static double findGeometricSum(int k){
       if (k==0)
       {
           return 1;
       }
       double ans = 1/Math.pow(2,k)+findGeometricSum(k-1);
       return ans;
    }
    public static void main(String args[])
    {
        System.out.println(findGeometricSum(4));
    }
}
