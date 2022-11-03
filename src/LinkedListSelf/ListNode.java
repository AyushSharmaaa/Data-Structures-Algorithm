package LinkedListSelf;

import java.util.Scanner;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next = null;
    }

    public static ListNode takeInput(){
        ListNode head = null , tail = null;
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        while (val!=-1){
            ListNode newNode = new ListNode(val);
            if (head==null){
                head=newNode;
                tail = newNode;
            }
            else {
                tail.next=newNode;
                tail=newNode;
            }
            val = scanner.nextInt();
        }
        return head;
    }

    public static void print(ListNode head){
        if (head==null){
            System.out.println("Null");
        }
        while (head!=null){
            System.out.print(head.val +" ");
            head=head.next;
        }
    }
    //-------------------------------------------WELCOME TO ListNode-----------------------------------------------------------------//
    public static void insertAtTail(ListNode head, ListNode tail , int data){
        ListNode temp = new ListNode(data);
        if (head==null){
            head = temp;
            tail = temp;
        }
        else {
            tail.next=temp;
            tail = temp;
        }
    }
    public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode ansHead = null;
        ListNode ansTail = null;
        int carry = 0;
        while (head1!=null||head2!=null||carry!=0){
            int val1 = 0;
            if (head1!=null){
                val1= head1.val;
            }

            int val2 = 0;
            if (head2!=null){
                val2= head2.val;
            }

            int sum = carry + val1 + val2;
            int digit = sum%10;

            ListNode temp = new ListNode(digit);
            if (ansHead==null){
                ansHead = temp;
                ansTail = temp;
            }
            else {
                ansTail.next=temp;
                ansTail = temp;
            }
            carry = sum/10;
            if (head1!=null){
                head1=head1.next;
            }
            if (head2!=null){
                head2=head2.next;
            }
        }
        return ansHead;
    }

    public static void main(String args[]){
        ListNode head = takeInput();
        ListNode head2 = takeInput();
        print(addTwoNumbers(head,head2));
    }
}
