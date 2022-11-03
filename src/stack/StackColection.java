package stack;

import java.util.Stack;

public class StackColection {

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        for (int i=1; i<=10; i++){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+"->");
        }
    }
}
