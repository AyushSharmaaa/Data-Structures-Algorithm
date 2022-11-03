package recursion;

public class CheckNumberInArray
{
   /* public static boolean checkNumber(int input[], int x, int startIndex) {
        if(startIndex == input.length) {
            return false;
        }
        if(input[startIndex] == x) {
            return true;
        }
        return checkNumber(input, x, startIndex + 1);
    }
    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input, x, 0);
        }
    */

    public static boolean checkNumber(int input[],int size, int x) {
        if(size==0) {
            return false;
        }
        if(input[size]==x) {
            return true;
        }
         return checkNumber(input,size-1,x);
    }
    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input,input.length-1,x);
    }
    public static void main(String args[])
    {
        int input[] = {9,8,7,9};
        int x = 0;
        System.out.println(checkNumber(input,x));
    }
}
