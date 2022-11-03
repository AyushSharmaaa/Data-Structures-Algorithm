package string;

public class ReverseK_Group {
    public static String revrsePair(String str , int k){
        int len = str.length();
        for (int i=0; i<str.length();i++){
            // starting from the current position
            if (i + k > len) {
                break;
            }
            // Reverse first k characters
            str = str.substring(0, i) + new String(new StringBuilder(
                    str.substring(i, i + k)).reverse()) +
                    str.substring(i + k);

            // Skip the next k characters
            i += 2 * k;
        }
        return str;
    }
    public static void main(String args[]){
        String s = "geeksforgeeks";
        int len = s.length();
        int k = 3;
        System.out.println(revrsePair(s,k));

    }
}
