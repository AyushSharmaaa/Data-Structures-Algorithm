package string;

import java.util.Scanner;

public class ReverseString {
    public static void reverse(String str){
      for (int i=str.length()-1; i>=0; i--){
          System.out.print(str.charAt(i));
      }
    }

    public static void compareStr(String st1 , String str2){
        //s1>s2 = +ve
        // s1==s2 = 0
        //s1<s2 = -ve
        if (st1.compareTo(str2)==0){
            System.out.println("String Are Equal");
        }
        else {
             System.out.println("String Are Not Equal");
        }
    }

    public static void subSringExamp(String str1){
        System.out.println(   str1.substring(2,str1.length()));
    }

    public static void intStringToIntVal(String str1){
        int num = Integer.parseInt(str1);
        System.out.print(num);
    }

    public static void numToString(int n){
        String newStr = Integer.toString(n);
        System.out.println(newStr);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //String str1 = scanner.nextLine();
        //String str2 = scanner.nextLine();
       // reverse(str1);
        //compareStr(str1,str2);
        //subSringExamp(str1);
      // intStringToIntVal("123");
      // numToString(60);
    }
}
