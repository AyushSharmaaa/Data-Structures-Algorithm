package assignment_recursion1;

public class PairStar {
    public static String addStars(String s) {
        if(s.length()==1)
            return s;
        String smallans=addStars(s.substring(1));
        if(s.charAt(0)==smallans.charAt(0))
            return s.charAt(0)+"*"+smallans;
        else
            return s.charAt(0)+smallans;
    }

   public static void main(String args[])
   {
       System.out.println(addStars("Hello"));
   }
}

