package LinkedListSelf;

import java.util.Vector;

public class MyHashSet {
        Vector<Integer> m;
        int size;
    public MyHashSet() {
        int size = (int)Math.pow(10, 6)+1;
        m = new Vector<>(size);
    }

    public void add(int key) {
        m.set(key, 1);
    }

    public void remove(int key) {
        m.set(key, 0);
    }

    public boolean contains(int key) {
        if (m.get(key)==key){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.add(2);
        obj.remove(2);
        //System.out.println(obj.contains(1));
    }
}
