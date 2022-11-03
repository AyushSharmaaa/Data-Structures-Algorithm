package PsudoCode;

public class Code5 {
    public static void main(String args[]){
        int p=0,q=7,r=10;
        if ((q^r^p)<(r+p+q)){
            r=(p+1)^q;
            q=q+p;
        }
        System.out.println(p+q+r);
    }
}
