package recursion_2;

public class Staircase
{
    public static int staircase(int n){

        if (n==0){
            return 1;
        }
        if (n<=0){
            return 0;
        }
        int x = staircase(n-3);
        int y = staircase(n-2);
        int z = staircase(n-1);
        return x+y+z;
    }
    public static void main(String args[]){
        System.out.println(staircase(5));
    }
}
