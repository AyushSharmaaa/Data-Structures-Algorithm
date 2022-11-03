package generics;

public class PainUse {
    public static void main(String args[]){
//        Pair<String> p = new Pair<String>("abc","def");
//        p.setFirst("Ayush");
//        System.out.println(p.getFirst());
//        System.out.println(p.getSecond());
//        Pair<Integer> p1 = new Pair<Integer>(1,2);
//        System.out.println(p1.getFirst());
//        Pair<Integer , String> p = new Pair<>(191500210 , "Ayush");
//        System.out.println(p.getFirst());
//        System.out.println(p.getSecond());

        int a = 10;
        int b = 20;
        Pair<Integer , Integer> InternalPair = new Pair<>(a,b);
        Pair<Pair<Integer,Integer>,Integer> p2 = new Pair<>(InternalPair,30);
        System.out.println(p2.getSecond());
        System.out.println(p2.getFirst().getFirst());
        System.out.println(p2.getFirst().getSecond());

    }
}
