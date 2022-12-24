package arrays_arraylist;

import java.util.Arrays;

public class MoveAllZerosToEndArray {
    public static void main(String[] args) {
        int[] arr = {0};
        int[] arr2 = {0,1,0,3,13};
        //moveZeros(arr2);
        moveZeros2(arr2);
    }

    public static void moveZeros(int[] arr){

        int count = 0;

        for (int each : arr){
            if (each != 0){
                arr[count++] = each;
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] =0;
        }
        System.out.println(Arrays.toString(arr));   //{0,1,0,3,13};
    }
    public static void moveZeros2(int[] nums){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]= temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    }

