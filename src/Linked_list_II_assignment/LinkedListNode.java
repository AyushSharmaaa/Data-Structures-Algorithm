package Linked_list_II_assignment;

import java.util.Scanner;

public class LinkedListNode <T>{
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data){
        this.data=data;
        this.next=null;
    }

    public static LinkedListNode<Integer> takeinput(){
        LinkedListNode<Integer> head = null , tail = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        while (data!=-1){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            if (head==null){
                head=newNode;
                tail=newNode;
            }
            else {
                tail.next=newNode;
                tail=newNode;
            }
            data=scanner.nextInt();
        }
        return head;
    }
    public static void print(LinkedListNode<Integer> head){
       if (head==null){
           return;
       }
        LinkedListNode<Integer> temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static int findNodeRec(LinkedListNode<Integer> head, int n) {
      int count = 0;
      if (head==null){
          return -1;
      }
      if (head.data==n){
           return 0;
       }
     int smallAns = findNodeRec(head.next,n);
      if (smallAns==-1){
          return -1;
      }
      return smallAns+1;
    }
    public static void evenAfterOdd(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        if (head==null||head.next==null){
            return;
        }
        LinkedListNode<Integer> newNode;
        while (head!=null){
            if (head.data%2!=0){
                System.out.print(head.data+" ");
            }
            head=head.next;
        }
        while (temp!=null){
            if (temp.data%2==0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }

//    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
//
//    }
    public static void main(String args[]){
        LinkedListNode<Integer> head = takeinput();
      //System.out.println(findNodeRec(head,30));
//        evenAfterOdd(head);
        //print(swapNodes(head,1,2));
    }
}
