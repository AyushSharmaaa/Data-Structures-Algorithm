package searching;
import java.util.Scanner;
public class Linear_Sequential {
    public static void LinearSearch(int arr[] , int n){
        int cout = 0 , pos=0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==n){
               cout++;
               pos=i+1;
            }
        }
        if (cout>0){
            System.out.println("Found at Index - " + pos);
        }
        else {
            System.out.println("Not Found");
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Size of Array");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element in Array");
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Number which you want To search");
        int n = scanner.nextInt();

        LinearSearch(arr,n);

    }
}
