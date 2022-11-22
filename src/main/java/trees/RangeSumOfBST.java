package trees;

public class RangeSumOfBST {

    public static int sumOfBST(TNode root, int low, int high) {

        int sum = 0;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;


        if (root == null) return 0;

        if (root.leftChild.value == low && root.rightChild.value == high) {
            sum = root.leftChild.value + root.value + root.rightChild.value;
        }

        return sum;


    }

    public static void main(String[] args) {

        MyTreeCollection tree = new MyTreeCollection();

        Integer[] numbers = {10, 5, 15, 3, 7, null, 18};

        for (int i = 0; i < numbers.length; i++) {
            tree.insert(numbers[i]);
        }
        System.out.println(tree);


        // VisualizeTree.printTree(tree.root, null, false);


    }


}
