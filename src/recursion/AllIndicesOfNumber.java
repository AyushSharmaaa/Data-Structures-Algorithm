package recursion;

public class AllIndicesOfNumber
{
    public static int[] allIndexes(int input[], int x, int startIndex) {
        if(startIndex == input.length) {
            int ret [] = new int[0];
            return ret;
        }
        int smallAns[] = allIndexes(input, x, startIndex + 1);
        if(input[startIndex] == x) {
            int ans[] = new int[smallAns.length + 1];
            ans[0] = startIndex;
            for(int i = 0; i < smallAns.length; i++) {
                ans[i + 1] = smallAns[i];
            }
            return ans;
        }
        else {
            return smallAns;
        }
    }
    public static int[] allIndexes(int input[], int x) {
        return allIndexes(input, x, 0);
    }
    public static void main(String args[])
    {
        int input[] = {9,8,9,8,9,8,9,8};
        int x = 8;
        int output[] = AllIndicesOfNumber.allIndexes(input,x);

        // Printing the output array
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
