package cryptography_practical;
import java.util.Scanner;

public class PlainTextToCipher {
    public static void main(String args[]){
        System.out.println("Please Enter any Plain Text!!");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //Plain Text Char Array
        char plaintext[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            plaintext[i] = str.charAt(i);
        }

        //Plain text to cipher text
        System.out.println("Cipher Text :- ");
        char ciphertext[] = new char[str.length()];
        for (int i = 0; i<str.length(); i++){
            int a = plaintext[i]+3;
            char cc =(char)a; //Converting ASCII value to Character
            ciphertext[i] = cc;
            System.out.print(cc);
        }
        System.out.println();
        System.out.println("______________________");

        //Chipher text to plain text
        System.out.println("Plain Text :- ");
        char plaintext2[] = new char[str.length()];
        for (int i = 0; i<str.length(); i++){
            int a = ciphertext[i]-3;
            char cc =(char)a; //Converting ASCII value to Character
           plaintext2[i] = cc;
            System.out.print(cc);
        }
//        // Printing the elements of array
//        // using for each loop
//        System.out.println("Cipher Text :- ");
//        for (char c : plaintext) {
//            int a = c+3;
//            char cc =(char)a; //Converting ASCII value to Character
//            System.out.print(cc);
//        }
//        System.out.println("Plain Text :- ");
//        for (char c : ch) {
//            int a = cc+3;
//            char cc =(char)a; //Converting ASCII value to Character
//            System.out.print(cc);
//        }

    }
}
