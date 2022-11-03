package PsudoCode;

public class Code8 {
   // int p=2,q=8;
    public int fun(int p,int q){
        if (p+20>q || p>30){
            return fun(p-20,p+20);
        }
        return p+q+20;
    }
    public static void main(String args[]){
        Code8 c8 = new Code8();
        System.out.println(c8.fun(2,8));
    }
}
