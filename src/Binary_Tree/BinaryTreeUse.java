package Binary_Tree;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        System.out.println("Enter Root data");
        rootData = s.nextInt();
        if (rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left=takeInput(s);
        root.right=takeInput(s);
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
        Scanner scanner = new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
       System.out.println("Enter rootr data");
       int rootData = scanner.nextInt();
        if (rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueqe(root);
        while (!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.dequeue();
            System.out.println("Enter left child of : " + front.data);
            int leftChild = scanner.nextInt();
            if (leftChild!=-1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.enqueqe(child);
                front.left=child;
            }
            System.out.println("Enter Right child of : " + front.data);
            int rightChild = scanner.nextInt();
            if (rightChild!=-1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.enqueqe(child);
                front.right=child;
            }
        }
        return root;
    }
    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String toBePrinted = root.data + " -> ";
        if (root.left!=null){
            toBePrinted+="L:" + root.left.data + ",";
        }
        if (root.right!=null){
            toBePrinted+="R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }
    public static int countNode(BinaryTreeNode<Integer> root){
        if (root==null){
            return 0;
        }
        int count = 1;
        count+=countNode(root.left);
        count+=countNode(root.right);
        return count;
    }
    public static void preOrderTraversal(BinaryTreeNode<Integer> root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" , ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void postOrderTraversal(BinaryTreeNode<Integer> root){
        if (root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" , ");
    }
    public static void inOrderTraversal(BinaryTreeNode<Integer> root){
         if (root==null){
             return;
         }
         inOrderTraversal(root.left);
         System.out.print(root.data+" , ");
         inOrderTraversal(root.right);
    }
    public static void main(String args[]) throws QueueEmptyException {
        Scanner scanner = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        preOrderTraversal(root);
            System.out.println();
            postOrderTraversal(root);
            System.out.println();
        inOrderTraversal(root);
       // print(root);
       // System.out.println(countNode(root));
       // scanner.close();
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//        root.left=node1;
//        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//        root.right=node2;
    }
}