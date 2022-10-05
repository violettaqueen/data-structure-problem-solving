package stacks;

import java.util.Stack;

public class GreaterThenTheirRight {

    public static void main(String[] args) {

        Integer[] arr = {10, 4, 6, 3, 5};
        find(arr);


    }

    // not optimal solution
    public static void find(Integer[] arr) {

        Stack<Integer> num = new Stack<>();

        int j = arr.length - 1; //last index #4

        while (j >= 0) {  //index


            if (j == arr.length - 1) {  //if j is last element in array, don't need to pop it
                num.push(arr[j]);
            }
            if (j != arr.length - 1) {

                if (arr[j] > num.peek()) { // index
                    num.push(arr[j]);
                }
            }
            j--;
        }
        System.out.println(num);

    }





}

//Given an unsorted integer array, print all greater elements than all elements present to their right using Stack.
//• For example, consider the array [10, 4, 6, 3, 5]. The elements that are greater than all elements to their right are 10, 6,
//and 5.
//• 10>4&10>6&10>3&10>5