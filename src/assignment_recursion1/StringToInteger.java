package assignment_recursion1;

public class StringToInteger {
    public static int convertStringToInt(String input){
       if (input.length()==1){
           int i = input.charAt(0) - 48 ; // Coz 48 is ascii value of 0
           return i;
       }
       int smallInput = convertStringToInt(input.substring(1,input.length()));
       int a = input.charAt(0) - 48;
       int integer = (int) (a * Math.pow(10,input.length()-1)+smallInput);
       return integer;
    }
    public static void main(String args[])
    {
        System.out.println(convertStringToInt("123"));
    }
}
