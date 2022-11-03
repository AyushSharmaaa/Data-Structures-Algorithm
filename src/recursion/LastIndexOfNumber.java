package recursion;

public class LastIndexOfNumber
{
    public static int lastIndex(int input[],int lastIndex , int x) {
        if (lastIndex==0)
        {
            return -1;
        }
        if (input[lastIndex]==x)
        {
            return lastIndex;
        }
        return lastIndex(input,lastIndex-1,x);
    }
    public static int lastIndex(int input[], int x) {
        return lastIndex(input,input.length-1,x);
    }
        public static void main(String args [])
    {
        int input[] = {9,1,10,49,1,45,65,34,44,100};
        System.out.println(lastIndex(input,1));
    }
}
