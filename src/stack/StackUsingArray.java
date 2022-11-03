package stack;

public class StackUsingArray {
   private int data[];
   private int top; // index of topmost element of stack

    public StackUsingArray(int capacity){
        data = new int[capacity];
        top = -1;
    }
    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2*temp.length];
        for (int i=0; i<=top; i++){
            data[i] = temp[i];
        }
   }
    public boolean isEmpty(){
//        if (top==-1){
//            return true;
//        }
//        else {
//            return false;
//        }
        return (top==-1);
    }

    public int size(){
        return top+1;
    }

    public int top() throws StackEmptyException {
        if (size()==0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
            return data[top];
    }

    public void push(int element){
        if (size()==data.length){
           doubleCapacity();
        }
        top++;
        data[top] = element;
    }

    public int pop() throws StackEmptyException{
        if (size()==0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
    public static void main(String args[]) throws StackEmptyException {
        StackUsingArray st = new StackUsingArray(2);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(555);
        System.out.println(st.top());


//        try {
//            System.out.println(st.pop());
//            System.out.println(st.pop());
//            System.out.println(st.pop());
//            System.out.println(st.pop());
//            System.out.println(st.pop());
//        } catch (StackEmptyException e){
//            e.printStackTrace();
//        }
    }
}
