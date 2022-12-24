package mentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxNumber {

    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 40;
        int num3 = 60;

        int max = 0;

        if (num1 > num2 && num1 > num3){
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        }else{
            max = num3;
        }
        System.out.println(max);


        List<Integer> list = new ArrayList<>(Arrays.asList(30,40,60));
        for (Integer integer : list) {
            max=Collections.max(list);
        }
        System.out.println(max);



    }
}
