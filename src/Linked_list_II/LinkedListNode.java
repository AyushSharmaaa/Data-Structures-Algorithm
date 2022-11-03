package Linked_list_II;
import java.util.Scanner;

public class LinkedListNode <T>
{
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
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head){
        if (head==null || head.next==null){
            return head;
        }
        LinkedListNode<Integer> fast = head.next , slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
         while (head1!=null&&head2!=null){
             if (head1.data<head2.data){
                       head1.next=mergeTwoSortedLinkedLists(head1.next,head2);
                       return head1;
                   }
             if (head2.data< head1.data){
                       head2.next=mergeTwoSortedLinkedLists(head1,head2.next);
                       return head2;
                   }
               }
         return head1;
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
      if (head==null || head.next==null){
          return head;
      }

        LinkedListNode<Integer> mid = findMid(head); //find mid
        LinkedListNode<Integer> left = head; // left start from head  //head - mid
        LinkedListNode<Integer> right = mid.next; // right start from mid.next //mid+1 - tail
        mid.next=null;

        //Recursive calls
        left=mergeSort(left);
        right=mergeSort(right);

        //merge
       LinkedListNode<Integer> result = mergeTwoSortedLinkedLists(left,right);

       return result;
    }

    public static LinkedListNode<Integer> insertRecursively(LinkedListNode<Integer> head , int pos , int elem){
        if (pos==0){
            LinkedListNode<Integer> newnode = new LinkedListNode<>(elem);
            newnode.next=head;
            return newnode;
        }
        if (head==null){
            return head;
        }
        head.next = insertRecursively(head.next,pos-1,elem);
        return head;
    }

    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        LinkedListNode<Integer> smallHead = deleteNodeRec(head.next, pos - 1);
        head.next = smallHead;
        return head;
    }
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if (head==null||head.next==null){
            return head;
        }
        LinkedListNode<Integer> newNode = reverseLinkedListRec(head.next);
        head.next.next=head;
        head.next=null;

          return newNode;
    }
    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        LinkedListNode<Integer> current = head , prev = null;

        while (current!=null){
            LinkedListNode<Integer> temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }
    public static void main(String args[]){
        LinkedListNode<Integer> head1 = takeinput();
//        LinkedListNode<Integer> head2 = takeinput();
//        print(mergeTwoSortedLinkedLists(head1,head2));
          print(reverse_I(head1));
    }
}
