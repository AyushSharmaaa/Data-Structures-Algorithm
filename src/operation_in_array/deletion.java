package operation_in_array;

public class deletion {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int element = 3;

        for (int i = 0; i < arr.length; i++) {
            if (element==arr[i]){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
            }

        }
        for (int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
