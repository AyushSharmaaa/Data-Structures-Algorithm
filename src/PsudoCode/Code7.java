package PsudoCode;

public class Code7 {
    public static void main(String args[]){
     int a[]={4,2,1};
     int r=2;
     r=r^a[2];
     if (a[1]>1){
         r=r^1;
     }
     else {
         r=r^4;
     }
     System.out.println(r);
    }
}
