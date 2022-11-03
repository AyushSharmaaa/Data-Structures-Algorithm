package Queue;

public class QueueUsingArray {
    private int data[];
    private int front; // index at which front element is stored
    private int rear; //index at which rear element is stored
    private int size;

    public QueueUsingArray(int len){
        data = new int[len];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int front() throws QueueEmptyException{
        if (size==0){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        return data[front];
    }

    public void enqueue(int element){
        if (size==data.length){
           doubleCapacity();
        }
        if (size==0){
            front=0;
        }
        size++;
        rear++;
        if (rear==data.length){
            rear=0;
        }
        data[rear]=element;
    }

    public int dequeue() throws QueueEmptyException{
        if (size==0){
            throw  new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        if (front==data.length){
            front=0;
        }
        size--;
        if (size==0){
            front = -1;
            rear = -1;
        }
        return temp;
    }

    private void doubleCapacity(){
        int tempArr[] = data;
        data = new int[data.length*2];
       int index = 0;
       for (int i=front; i<tempArr.length;i++){
            data[index]=tempArr[i];
            index++;
        }
       for(int j=0; j<front-1;j++){
           data[index]=tempArr[j];
           index++;
       }
       front=0;
       rear=tempArr.length-1;
    }
    public static void main(String args[]) throws QueueEmptyException , QueueFullException{
        QueueUsingArray queue = new QueueUsingArray(5);
        for (int i=1; i<=10; i++){
            queue.enqueue(i);
        }

        while (!queue.isEmpty()){
            System.out.print(queue.dequeue()+"->");
        }

//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
    }
}
