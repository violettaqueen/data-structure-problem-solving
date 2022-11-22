package queue;

import java.util.*;

public class TimeNeededToBuyTickets {

    public static void main(String[] args) {

        int[] arr = {2,3,2};
        System.out.println(timeNeededToBuyTickets(arr, 2));


    }
    public static int timeNeededToBuyTickets(int[] arr, int k){ //k is an element of array

        ArrayList<Integer> list = new ArrayList<>();

        int time = 0;

        while(arr[k] != 0){

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    continue;
                }
                if (arr[k] == 0){
                    break;
                }
                list.add(arr[i]--);
            }
        }
        return list.size();
    }

}
