package searching;
import java.util.Scanner;

//Applied on Sorted Array
public class Binary {
    public static int BinarySearch(int arr[] , int n){
        int low = 0 , high = arr.length-1;

        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==n){
                return mid;
            }
            else if (n>arr[mid]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Size of Array");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Sorted Element in Array");
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Number which you want To search");
        int n = scanner.nextInt();

        int result = BinarySearch(arr , n);
        if (result==-1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found");
        }
    }
}
