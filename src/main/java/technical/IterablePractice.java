package technical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Mom", "hooray", "Mom"));
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String each = it.next();
            if (each.equals("Mom"))
            it.remove();
        }
        System.out.println(list);


    }
}
