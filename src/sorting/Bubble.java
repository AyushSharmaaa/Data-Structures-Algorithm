package sorting;
import java.util.Scanner;

public class Bubble {
    public static void bubbleSort(int arr[]){
        for (int i=1; i<=arr.length; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    //Swapping
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        // Loop for Printing the array arr[]
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the element in the array");
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr);
    }
}
