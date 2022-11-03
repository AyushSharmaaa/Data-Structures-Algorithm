package generics;

import vehicle.Vehicle;

public class Print {

    public static <T> void printArray(T a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer a[] = new Integer[10];
        for (int i=0;i<a.length;i++){
            a[i] = i+1;
        }

        String s[] = new String[10];
        for (int i =0; i< s.length;i++){
            s[i] = "Ayu";
        }
        printArray(a);
        printArray(s);

//        StuClass s[] = new StuClass[10];
//        for (int i=0;i<10;i++){
//            s[i] = new StuClass();
//        }
//        printArray(s);
    }
}
