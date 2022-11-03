package five_ways_of_swapping;

public class Swapping {
    public static void main(String args[]){
        int a=10 , b=20;
        //Logic 1 :- third variabe
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("a = "+a+" and b = "+b);

        //Logic 2 :- Using + & - without using third variable
//        a=a+b; //10+20=30
//        b=a-b; //30-20=10
//        a=a-b; //30-10=20
//        System.out.println("a = "+a+" and b = "+b);

        //Logic 3:- Using * & / without using third variable
//        a=a*b; //10*20=200
//        b=a/b; //200/20=10
//        a=a/b; //200/20=20
//        System.out.println("a = "+a+" and b = "+b);

        //Logic 4:- Using bitwise XOR(^)
//        a=a^b; //a=1010_ and b=10100 = 11110(30)
//        b=a^b; // a=11110 and b=10100 = 1010_()
//        a=a^b; //a=11110 and b = 1010_ = 10100(20)
//        System.out.println("a = "+a+" and b = "+b);

        //Logic 5:- Single statement
//        b=a+b-(a=b);
//        System.out.println("a = "+a+" and b = "+b);

        //Logic 6:- Single statement
//        b=a*b/(a=b);
//        System.out.println("a = "+a+" and b = "+b);
    }
}
