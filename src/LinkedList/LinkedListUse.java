package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        while (data!=-1){
            Node<Integer> newNode = new Node<>(data);
            if (head==null){
                head=newNode;
            }
            else{
                Node<Integer> temp =head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
           data=scanner.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String args[]){
//        Node<Integer> node1 = new Node<>(10);
////        System.out.println(node1.data);
////        System.out.println(node1.next);
//        Node<Integer> node2 = new Node<>(20);
////
////        System.out.println(node2);
////        System.out.println(node1.next);
//        Node<Integer> node3 = new Node<>(30);
//        node1.next=node2;
//        node2.next=node3;
//        Node<Integer> head = node1;
//        print(head);

        Node<Integer> head = takeInput();

        print(head);
    }
}
