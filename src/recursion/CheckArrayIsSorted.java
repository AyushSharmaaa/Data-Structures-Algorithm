package recursion;

public class CheckArrayIsSorted
{
    public static boolean checkSorted(int input[]){

        if(input.length <= 1){
            return true;
        }

        int smallInput[] = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallInput[i - 1] = input[i];
        }

        boolean smallAns = checkSorted(smallInput);
        if(!smallAns){
            return false;
        }
        if(input[0] <= input[1]){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkSorted2 (int input[]) {

        if (input.length <= 1) {
            return true;
        }
        if (input [0] > input[1]) {
            return false;
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }

        boolean smallAns = checkSorted2(smallInput);
        return smallAns;
    }

    //This Function Checks if the array is sorted from startIndex to End
    private static boolean checkSortedBetter(int input[] , int startIndex)
    {
        if (startIndex >= input.length - 1) {
            return true;
        }
        if (input[startIndex]>input[startIndex + 1]) {
            return false;
        }
       boolean smallAns = checkSortedBetter(input , startIndex +1);
        return smallAns;
    }
    public static boolean checkSortedBetter(int input[])
    {
        return checkSortedBetter(input,0);
    }

    public static void main(String args[])
    {
        int input[] = {1,2,3,45};
        System.out.println(checkSortedBetter(input));
    }
}
