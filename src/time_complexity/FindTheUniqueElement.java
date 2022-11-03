package time_complexity;

public class FindTheUniqueElement {
   public static int findUnique(int[] arr) {
       int ans = 0;
       for (int i = 0; i < arr.length; i++) {
           int count = 0;
           for (int j = 0; j < arr.length; j++) {
               if (arr[i] == arr[j]) {
                   count++;
               }
           }
           if (count == 1) {
               ans = arr[i];
               return arr[i];
           }
       }
       return ans;
   }
    public static void main(String args[]){
        int arr[] = {3,6,3,6,2,2,7,7,1};
        System.out.println(findUnique(arr));
    }
}