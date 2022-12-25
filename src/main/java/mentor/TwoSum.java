package mentor;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {16, 3, 11, 5, 15};
        int target = 8;
        System.out.println(Arrays.toString(twoSumTwoPointer(nums, target)));
    }

    public static int[] twoSumTwoPointer(int[] nums, int target) {

        Arrays.sort(nums);
        int p1 = 0;
        int p2 = nums.length - 1;

        while (nums[p2] > target) {
            p2--;
            for (int i = 0; i < p2; i++) {
                if (nums[p1] + nums[p2] == target) {
                    return new int[]{nums[p1], nums[p2]};
                }
            }
        }
        return new int[]{};

    }
}
