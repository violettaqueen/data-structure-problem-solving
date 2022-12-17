package collection;

import java.util.Iterator;
import java.util.Set;

public class SetIteration {

    public static void main(String[] args) {
         /*
    1.  Set<String> someObj = Set.<String>of("1", "2", "3", "val1", "val2", "val3");
    how to iterate someObj, at least two way
     */
        Set<String> someObj = Set.of("1", "2", "3", "val1", "val2", "val3");

        someObj.forEach(o -> System.out.println(o + " "));

        for (String each : someObj){
            System.out.println(each);
        }

        for (Iterator it = someObj.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

    }
}
