package mwfs;

import java.util.Scanner;

public class Sorting {
        int arr[];
        int size;

        public Sorting(int len){
            size = len;
            arr = new int[size];
        }
        public void input(){
            Scanner scanner = new Scanner(System.in);
            for (int i=0; i<size; i++){
                arr[i]=scanner.nextInt();
            }
        }
        public void bubbleSort(){
            int t;
            for (int i=1; i<=size; i++){
                for (int j=0; j<size-1; j++){
                    if (arr[j]>arr[j+1]){
                        t=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                    }
                }
            }
            for (int i=0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
        }

        public void selectionSort(){
           int min , loc;
           for (int i=0; i<size; i++){
                min = arr[i];
                loc=i;
                for (int j=i+1; j<size; j++){
                    if (arr[j]<min){
                        min=arr[j];
                        loc=j;
                    }
                    int temp = arr[loc];
                    arr[loc] = arr[i];
                    arr[i] = temp;
                }
            }
           //printng
            for (int i=0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String args[]){
          Sorting ob = new Sorting(6);
          ob.input();
          //ob.bubbleSort();
            ob.selectionSort();
        }
    }

