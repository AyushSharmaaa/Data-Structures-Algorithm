package PsudoCode;

public class Code6 {
    public static void main(String args[]){
        int p=108,q=2,r=3;
        if (p%9==0){
            q=q+(p%2);
            System.out.println(p+"-"+q+"-"+r);
        }
        else {
            r=r+(p%7);
            System.out.println(r);
        }
    }
}
