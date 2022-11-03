package stack;

public class StackUsingLL <T>{
    private Node<T> haed;
    private int size;
    public StackUsingLL(){
        haed = null;
        size = 0;
    }

    public int getSize() {
        //Implement the getSize() function
        return (size);
    }

    public T top() throws StackEmptyException {
        //Implement the top() function
        if (size==0){
          StackEmptyException e = new StackEmptyException();
          throw e;
        }
        return haed.data;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (size==0);
    }

    public void push(T element) {
        Node<T> newNode = new Node<T>(element);
        //Implement the push(element) function
        size++;
        newNode.next=haed;
        haed=newNode;

    }

    public T pop() throws StackEmptyException {
        //Implement the pop() function
        if (size==0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        size--;
        T temp = haed.data;
        haed=haed.next;
        return temp;
    }


    public static void main(String args[]) throws StackEmptyException {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
//        stack.push(10);
//        stack.push(20);
//        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
