package recursion;

public class FirstIndexOfNumber
{
    private static int firstIndex(int input[],int startIndex ,int x) {
        if (startIndex>=input.length) {
            return startIndex;
        }
        if (input[startIndex]==x){
            return startIndex;
        }
       int smallAns = firstIndex(input,startIndex+1,x);
        return smallAns;
    }
    public static int firstIndex(int input[], int x) {
        return firstIndex(input,0,x);
    }
    public static void main(String args[])
    {
        int input[] = {9,1,10,49,1,45,65,34,44,100};
        System.out.println(firstIndex(input,100));
    }
}
