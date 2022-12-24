package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,0,3,0,2,0,1));
        int originalSize = list.size();  //7
        list.removeAll(Arrays.asList(0)); //
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);





    }
}
