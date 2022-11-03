package PsudoCode;

public class Code2 {
    public static void main(String args[]){
        int a=7,b=8,c=7;
        c=(1^4)+c;
        a=(b+12)+c;
        b=(a+2)&a;
        if ((c&b)<b||5>b){
            a=c+a;
            a=(c+c)+a;
        }
        System.out.println(a+b+c);
        a=(b&9)+a;
        a=(c+c)+a;
        System.out.println(a+b+c);

    }
}
