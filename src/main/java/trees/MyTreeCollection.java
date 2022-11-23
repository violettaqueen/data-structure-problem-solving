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
    public static boolean isSameTree(TNode p, TNode q){


        if (p == null && q == null){
            return true;
        } else if (p == null ||  q == null) {
            return false;
        } else if (p.value != q.value) {
            return false;
        }else {
            return isSameTree(p.leftChild, q.leftChild) && isSameTree(p.rightChild, q.rightChild);
        }
    }

    public static int rangeOfSums (TNode root, int low, int high){

        int sum = 0;
        Stack<TNode> stack = new Stack<>();
        stack.push(root); //10

        while (!stack.isEmpty()){

            TNode current = stack.pop();  //popped it and comparing the current

            if (current.value >= low && current.value < high){
                sum += current.value;
            }
            if (low < current.value){
                stack.push(current.leftChild);
            }
            if (current.value < high){
                stack.push(current.rightChild);
            }
        }
        return sum;
    }



    public static void main(String[] args) {

        TNode root=new TNode(1);
        root.rightChild=new TNode(2);
        root.rightChild.leftChild=new TNode(3);

        MyTreeCollection treeA = new MyTreeCollection();
        MyTreeCollection treeB = new MyTreeCollection();
        int[] numbers = new int[]{1,2,3};

        for (int i = 0; i < numbers.length; i++) {
            treeA.insert(numbers[i]);
            treeB.insert(numbers[i]);
        }


        VisualizeTree.printTree(root,null,false);
        // System.out.println(inOrderTraversal(root));
        System.out.println(inOrderTraversal(root));
        System.out.println();

        System.out.println(isSameTree(treeA.root.leftChild, treeB.root.rightChild));




    }




}
