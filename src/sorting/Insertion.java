package sorting;

import java.util.Scanner;

public class Insertion {
    public static void intertionSort(int arr[]){
        for (int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
           arr[j+1] = current;
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
        intertionSort(arr);
    }
}
