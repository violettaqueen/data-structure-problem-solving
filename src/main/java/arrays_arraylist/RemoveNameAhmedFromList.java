package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNameAhmedFromList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed", "Violetta"));
        //names.removeIf(n -> n.equalsIgnoreCase("Ahmed"));
        System.out.println(names);
    }


}
