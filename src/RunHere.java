import java.util.Scanner;
public class RunHere {
    static int a=0,b=1,fib=0;
   public static void printFib(int n){
        if(n>0){
            fib = a + b;
            System.out.print(" "+fib);
            a = b;
            b = fib;
            printFib(n-1);
        }
    }
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(a+" "+b);
        printFib(n);
    }
}