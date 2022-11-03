package sorting;

import java.util.Scanner;

public class Merge {
    public static void mergeSort(int arr[] , int si , int ei){
        //Condition to check having at least 2 element
        if (si<ei){
            int mid = si+(ei-si)/2;
            mergeSort(arr,si,mid);
            mergeSort(arr,mid+1,ei);
            merge(arr,si,mid,ei);
        }
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int merged [] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged [x++] = arr[idx1++]; }
            else {
                merged [x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid) {
            merged [x++] = arr[idx1++];
        }
        while(idx2 <= ei) {
            merged [x++] = arr[idx2++];
        }
        //Copy elements into the array arr
        for(int i=0, j=si; i<merged. length; i++, j++) {
            arr[j] = merged[i];
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
        //Print arr
        mergeSort(arr,0, arr.length-1);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
