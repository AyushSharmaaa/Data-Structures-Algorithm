package assignment_recursion1;

public class ReplacePi
{
    public static String replace(String input){
        if (input.length()<=1)
        {
            return input;
        }
        String temp = replace(input.substring(1));
        if (input.charAt(0)=='p' && temp.charAt(0)=='i')
        {
            return "3.14" + replace(temp.substring(1));
        }
        else {
            /* input.charAt(0)+temp; */
            return input.charAt(0) + temp;
        }
    }
    public static void main(String args[])
    {
        System.out.println(replace("ipipii"));
    }
}
