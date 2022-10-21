package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToTheEnd_List {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,5,0,3,6 ));
        System.out.println(moveAllZerosToTheEnd(list));

    }
    public static List<Integer> moveAllZerosToTheEnd(List<Integer> list){
        //check the size
        //remove all zeros
        //check the new size
        //count total number of zeros
        //iterate through total number of zeros
        //add to list


        int originalSize = list.size();     //{1,0,2,0,5,0,3,6}  - 8
        list.removeAll(Arrays.asList(0));   //1,2,5,3,6
        int newSize = list.size();          // 5
        int totalNumberOfZeros = originalSize - newSize; //3

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }


}
