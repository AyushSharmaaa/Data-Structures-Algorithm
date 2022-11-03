
package LinkedListSelf;

import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = scanner.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int length(Node<Integer> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void printIthNode(Node<Integer> head, int i) {
        int count = 0;
        while (head != null) {
            if (count == i) {
                System.out.println(head.data);
            }
            count++;
            head = head.next;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
        Node<Integer> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node<Integer> temp = head;
        int count = 0;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node<Integer> deleteNodee(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }

        Node<Integer> temp = head;
        int count = 0;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void deleteNode(Node node) {
        if (node.next == null) {
            return;
        }

        Node temp = node;
        node.data = node.next.data;
        node.next.data = temp.data;

        node.next = node.next.next;
    }

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int getDecimalValue(Node head) {
        int ans = 0;
        Node temp = head;
        while (temp != null) {
            ans *= 2;
            // ans+=(temp.data);
            temp = temp.next;
        }
        return ans;
    }
    public static void reverseKgroup2(Node start, Node end) {
        //It is for reverse the group
        Node prev = null;
        Node cur = start;
        Node nex = start.next;

        while (prev != end) {
            cur.next = prev;
            prev = cur;
            cur = nex;
            if (nex != null) {
                nex = nex.next;
            }
        }
    }
    public static Node reverseKGroup(Node head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        Node start = head;
        Node end = head;
        int inc = k - 1;
        while (inc--!=0) {
            end = end.next;
            if (end == null) {
                return head;
            }
        }
        Node newHead = reverseKGroup(end.next, k);
        reverseKgroup2(start, end);
        start.next = newHead;
        return end;
}
//    public Node mergeTwoLists(Node list1, Node list2) {
//        return merge(list1,list2);
//    }
//    private Node merge(Node l1,Node l2){
//
//        if(l1==null) return l2;
//
//        if(l2==null) return l1;
//
//        if(l1.data < l2.data){
//
//            l1.next=merge(l1.next,l2);
//            return l1;
//        }
//        else {
//            l2.next=merge(l1,l2.next);
//            return l2;
//        }
//    }

    public static Node deleteDuplicates(Node head) {
        if (head==null || head.next==null){
            return head;
        }
        Node temp = head;
        while (temp.next!=null){
            if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else {
                temp=temp.next;
            }
        }
       return head;
    }
    public static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node previous = null;
        Node current = head;
        Node n = current.next;

        while (current != null) {
            current.next = previous;
            previous = current;
            current = n;
            if (n != null) {
                n = n.next;
            }
        }
        return previous;
    }
    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       slow.next = reverseList(slow.next);
        Node start = head;
        Node mid = slow.next;
        while (mid!=null){
            if (mid.data!=start.data){
                return false;
            }
            start=start.next;
            mid=mid.next;
        }
        return true;
    }

    public static Node joshQues(Node head1,Node head2){
//      if (head1.data==0&&head2.data==0){
//          return head1;
//      }
        int num1 = 0;
        int num2 = 0;
        int rev = 0;
        while (head1!=null||head2!=null){
            if (head1!=null){
                num1 = num1*10+ (int) head1.data;
                head1 = head1.next;
            }

            if (head2!=null){
                num2 = num2*10+(int) head2.data;
                head2 = head2.next;
            }

        }
        int sum = num1+num2;
        Node<Integer> head = null, tail = null;
        while (sum>0) {
            int rem = sum%10;
            sum = sum/10;
            Node<Integer> newNode = new Node<>(rem);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
    public static void main(String args[]){
        Node<Integer> head = takeInput();
        Node<Integer> head2 = takeInput();
        //System.out.println(length(head));
        //head=insert(head,30,0);
        //head= deleteNode(head,3);
        //System.out.println(joshQues(head,head2));
        print(joshQues(head,head2));
    }
}
