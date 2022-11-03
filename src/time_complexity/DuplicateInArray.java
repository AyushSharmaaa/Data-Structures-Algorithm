package time_complexity;

public class DuplicateInArray {
    public static int findDuplicate(int[] arr) {
        int total = 0;
        for (int i=0; i<arr.length;i++){
            total = total+arr[i];
        }
        int naturalSum = (arr.length-1)*(arr.length-2)/2;
        return total-naturalSum;
    }
    public static void main(String args[]){
        int arr[] = {0,7,2,5,4,7,1,3,6};
        System.out.println(findDuplicate(arr));
    }
}
