package Trees;
import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class TreeUse {

    public static TreeNode<Integer> takeInput(Scanner scanner){
        int n;
        System.out.println("Enter the Next Node");
        n = scanner.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter the number of child for = " + n);
        int childCount = scanner.nextInt();

        for (int i=0; i<childCount; i++){
            TreeNode<Integer> child = takeInput(scanner);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data + " : ";
        for (int i = 0; i<root.children.size(); i++){
            s = s + root.children.get(i).data+" , ";
        }
        System.out.println(s);
        for (int i = 0; i<root.children.size(); i++){
            print(root.children.get(i));
        }
    }
    public static TreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter root data");
       int rootData = scanner.nextInt();
        QueueUsingLL<TreeNode<Integer>> paindinNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        paindinNodes.enqueqe(root);
        while (!paindinNodes.isEmpty()){
            TreeNode<Integer> frontNode = paindinNodes.dequeue();
            System.out.println("Enter no of Children of : " + frontNode.data);
            int numChildren = scanner.nextInt();
            for (int i = 0; i<numChildren; i++){
                System.out.println("Enter " +(i+1)+ "th Child of " + frontNode.data);
                int child = scanner.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                paindinNodes.enqueqe(childNode);
            }
        }
        return root;
    }

    public static int numNodes(TreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int count = 1;
        for (int i = 0; i<root.children.size(); i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i<root.children.size(); i++){
            int childLargest = largest(root.children.get(i));
            if (childLargest>ans){
                ans = childLargest;
            }
        }
        return ans;
    }
    public static int height(TreeNode<Integer> root){
        if (root==null){
            return 0;
        }
        int count = 0;
        for (int i = 0; i<root.children.size(); i++){
           int childHeight = height(root.children.get(i));
           if (childHeight>count){
               count = childHeight;
           }
        }
        return count+1;
    }

    public static void depthOfANode(TreeNode<Integer> root , int k){
        if (k<0){
            return;
        }
        if (k==0){
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i<root.children.size(); i++){
            depthOfANode(root.children.get(i),k-1);
        }
    }

    public static void preOrder(TreeNode<Integer> root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        for (int i = 0; i<root.children.size(); i++){
            preOrder(root.children.get(i));
        }
    }

    public static void postOrder(TreeNode<Integer> root){
        if (root==null){
            return;
        }
        for (int i = 0; i<root.children.size(); i++){
            postOrder(root.children.get(i));
        }
        System.out.print(" " + root.data);
    }
    public static void main(String args[]) throws QueueEmptyException {
        Scanner scanner = new Scanner(System.in);
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        //System.out.println();
        postOrder(root);
//        //Make individual Nodes
//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//
//        //Make its links
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//
//        System.out.println(root);
    }
}
