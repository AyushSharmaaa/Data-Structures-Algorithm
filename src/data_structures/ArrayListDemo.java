package data_structures;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(10); //add()
        List1.add(20);
        List1.add(30);
        List1.add(0,100); //add(Index,Element)
//        System.out.println("Size :- " + List1.size()); //size()
//        System.out.println("Element of index 2 :- " + List1.get(2));//get()

        System.out.print("List 1 :- ");
        for (int i=0;i<List1.size();i++)
        {
            System.out.print(List1.get(i) +" ");
        }

        System.out.println(); //Change Line

        System.out.print("List 2 :- "); //Quick Traversal
        for (int element : List1){
            System.out.print(element+" ");
        }

//        List1.set(0,50);//set()
//        System.out.print("List 2 :- ");
//        for (int i=0;i<List1.size();i++)
//        {
//            System.out.print(List1.get(i) +" ");
//        }
//        System.out.println(); //Change Line
//
//        List1.remove(0);//remove()
//        System.out.print("List 3 :- ");
//        for (int i=0;i<List1.size();i++)
//        {
//            System.out.print(List1.get(i) +" ");
//        }
    }
}
