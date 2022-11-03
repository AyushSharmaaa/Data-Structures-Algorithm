package recursion_2;

public class KeypadProblem
{
    private static char[] numberOptions(int n) {
        switch (n){
            case 2:
                char option2[] = {'a','b','c'};
                return option2;
            case 3:
                char option3[] = {'d','e','f'};
                return option3;
            case 4:
                char option4[] = {'g','h','i'};
                return option4;
            case 5:
                char option5[] = {'j','k','l'};
                return option5;
            case 6:
                char option6[] = {'m','n','o'};
                return option6;
            case 7:
                char option7[] = {'p','q','r','s'};
                return option7;
            case 8:
                char option8[] = {'t','u','v'};
                return option8;
            case 9:
                char option9[] = {'w','x','y','z'};
                return option9;
            default:
                char option[] = {'\0'};
                return option;
        }
    }
    public static String[] keypad(int n){
        if (n==0 || n==1){
            String str[] = {""};
            return str;
        }
         int lastDigit = n%10;
        int smallNum = n/10;
        String smallAns[] = keypad(smallNum);
        char option[] = numberOptions(lastDigit);
        String outputAns[] = new String[smallAns.length*option.length];

        int k = 0;
        for (int i = 0; i<smallAns.length; i++){
            for (int j = 0; j<option.length; j++){
                outputAns[k] = smallAns[i]+option[j];
                k++;
            }
        }
        return outputAns;
    }
    public static void main(String args[]){
        int num = 23;
        String ans[] = keypad(num);
        for (int i = 0; i<=ans.length; i++){
            System.out.print(ans[i]+" , ");
        }
    }
}
