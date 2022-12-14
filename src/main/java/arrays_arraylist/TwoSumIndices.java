package arrays_arraylist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndices {

    public static void main(String[] args) {

        int[] array = {16, 3, 11, 5, 15}; //8
        //7
        //Arrays.sort(array); //3, 5, 11, 15, 16 != 8
        //p2    p1
        int target = 8;
        int p1 = 0;
        int p2 = array.length - 1;

        System.out.println(Arrays.toString(twoSumTwoPointer(array, target)));
        System.out.println(Arrays.toString(findIndicesWithTwoPointerAndHasMap(array, target)));
    }

    public static int[] twoSumTwoPointer(int[] array, int target) {

        int p1 = 0;
        int p2 = array.length - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) { //n
            map.put(array[i], i);
        }
        Arrays.sort(array); //n log(n)

        while (p1 < p2) {
            if (array[p1] + array[p2] == target) {
                return new int[]{map.get(array[p1]), map.get(array[p2])};
            } else if (array[p1] + array[p2] < target) {
                p1++;
            } else {
                p2--;
            }
        }
        return new int[0];
    }

    public static int[] findIndicesWithTwoPointerAndHasMap(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) { //n
            map.put(arr[i], i);
        }
        Arrays.sort(arr); //n log(n)

        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{map.get(arr[left]), map.get(arr[right])};
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0]; // time complexity O(n log(n)
    }
}
