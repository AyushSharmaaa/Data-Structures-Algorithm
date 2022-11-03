package string;
import java.util.*;
public class StringBuil {

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // CharAt
        for (int i=sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }

        //set char at index
        sb.setCharAt(0 , 'P');
        System.out.println("\r\n"+sb);

        //insert
        System.out.println(sb.insert(2,'n'));

        //delete extra 'n'
        System.out.println(sb.delete(2,3));

        //append
        sb.append('-'); // in String Class
        sb.append('T'); // str + 'T' = Poney-T.....
        sb.append('o');
        sb.append('n');
        sb.append('y');
        System.out.println(sb);


    }
}
