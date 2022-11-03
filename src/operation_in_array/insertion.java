package operation_in_array;

public class insertion {

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int element = 100;
        int pos = 3;

        for (int i=0; i<arr.length;i++){
            if (i==pos-1){
                arr[i]=element;
            }
        }
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
            }
        }
    }
