public class Program4_PrimeNumPrint
{
    public  static void main(String args[])
    {
        int n , temp = 0;
        for (int i = 2 ; i<=10; i++)
        {
            for (int j = 3 ; j<i ; j++)
            {
                if (i%j==0)
                {
                    temp++;
                }
            }
            if (temp==0)
            {
                System.out.println(i);
            }
            else
            {
                temp = 0;
            }
        }
    }
}