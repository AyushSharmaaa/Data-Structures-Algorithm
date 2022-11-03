package mwfs;

import java.util.Scanner;

public class Searching {
    int arr[];
    int size;

    public Searching(int len){
        size = len;
        arr = new int[size];
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
    }
    public void linearSearch(int n){
        int loc = -1;
        for (int i=0; i<size; i++){
            if (arr[i]==n){
              loc = i;
            }
        }
        if (loc==-1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found at index " + loc);
        }
    }

    public void binarySearch(int n){
        int low = 0 , high = size-1 , mid = -1;
        while (low<=high){
            mid = (low+high)/2;

            if (arr[mid]==n){
                break;
            }
            else if (n>arr[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }

        if (arr[low] == n) {
            System.out.println("Found At Index " + low);
        }
        else if (arr[high] == n) {
            System.out.println("Found At Index " + high );
        }
        else {
            System.out.println("Not Found" );
        }
    }
    public static void main(String args[]){
        Searching obj = new Searching(5);
        obj.input();
       // obj.linearSearch(10);
        obj.binarySearch(5);
    }
}
