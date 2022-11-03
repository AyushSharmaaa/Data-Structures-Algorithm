public class Program12_ArmstrongNumber
{
    public  static void main(String args[])
    {
        int n = 153;
        int temp = n;
        int lenght = 0;

        while (temp!=0)
        {
            temp = temp/10;
            lenght = lenght+1;
        }
        int Sectemp = n;
        int rem , arms = 0;
        while (Sectemp!=0)
        {
            int multi = 1;
            rem = Sectemp%10;


            for (int i = 1 ; i<=lenght; i++)
            {
                multi = multi*rem;
            }
            arms = arms + multi;
            Sectemp = Sectemp/10;
        }
        System.out.println(arms);
        if (arms==n)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
