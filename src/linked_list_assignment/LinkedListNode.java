package linked_list_assignment;

import java.util.Scanner;

public class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data){
        this.data=data;
        this.next=null;
    }

    public static LinkedListNode<Integer> takeInput(){
        LinkedListNode<Integer> head=null,tail=null;
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
        while (head!=null){
            System.out.print(head.data+" - ");
            head=head.next;
        }
    }

    public static int findNode(LinkedListNode<Integer> head, int n) {
        int count=0;
        while (head!=null){
            if (head.data==n){
                return count;
            }
            head=head.next;
            count++;
        }
        return -1;
    }
    public int lengthOfLinkedList(LinkedListNode<Integer> head){
        int count = 0;
        while (head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> newHead = null;
        LinkedListNode<Integer> newTail = null;
        LinkedListNode<Integer> tail = head;
        int lenght = head.lengthOfLinkedList(head);
        n=n%lenght;
        int count = 1;
        while (tail.next!=null){
            if (count==lenght-n){
                newTail=tail;
            }
            if (count==lenght-n+1){
                newHead=tail;
            }
            tail=tail.next;
            count++;

        }
        newTail.next=null;
        tail.next = head;
        return newHead;
    }

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if (head == null) {
            return head;
        }
        LinkedListNode<Integer> currHead = head;
        while (currHead.next!= null) {
            if (currHead.data.equals(currHead.next.data)) {
                currHead.next = currHead.next.next;
            } else {
                currHead = currHead.next;
            }
        }
        return head;
    }
    public static void printReverse(LinkedListNode<Integer> root) {
        if (root==null){
            return;
        }
       printReverse(root.next);
        System.out.print(root.data+" ");
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> fast = head , slow = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;

        }
        return slow;
    }

    public static void main(String args[]){
        LinkedListNode<Integer> head = takeInput();
//        System.out.println(findNode(head,5));
        System.out.println(midPoint(head).data);
    }
}
