package sorting;

import java.util.Scanner;

public class Selection {
    public static void selectionSort(int arr[]){
       for (int i=0; i<arr.length-1; i++){
           int smallest = i;
           for (int j=i+1; j<arr.length; j++){
               if (arr[smallest]>arr[j]){
                  smallest=j;
               }
           }
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i]=temp;
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
        selectionSort(arr);
    }
}
