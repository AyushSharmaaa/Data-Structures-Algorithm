package recursion;

public class SumOfDigits
{
    public static int sumOfDigits(int input){
      if (input<=9)
      {
          return input;
      }
     // int lastDigit = input%10;
      int ans =input%10 + sumOfDigits(input/10);
      return ans;
    }
    public static void main(String args[])
    {
        System.out.println(sumOfDigits(1234));
    }
}
