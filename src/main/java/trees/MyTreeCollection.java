package trees;

import queue.MyQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyTreeCollection {
//week 30
    TNode root;

    public static List<Integer> inOrderTraversal(TNode root) {

        Stack<TNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        while (root != null || !stack.isEmpty()) {

            if (root != null) {
                stack.push(root);
                root = root.leftChild;
            } else {
                root = stack.pop();
                list.add(root.value);
                root = root.rightChild;
            }
        }
        return list;
    }

    public void insert(int value){

        TNode newNode = new TNode(value);

        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;

        while (true){
            if (value<= current.value){

                if (current.leftChild == null){
                    current.leftChild = newNode;
                    break;
                }

                current = current.leftChild;

            }else if (current.rightChild == null){
                current.rightChild = newNode;
                break;
            }
            current = current.rightChild;
        }

    }

    public static void main(String[] args) {

        TNode root=new TNode(1);
        root.rightChild=new TNode(2);
        root.rightChild.leftChild=new TNode(3);


        VisualizeTree.printTree(root,null,false);
        // System.out.println(inOrderTraversal(root));
        System.out.println(inOrderTraversal(root));
        System.out.println();




    }




}
