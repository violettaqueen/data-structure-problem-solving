package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNameAhmed_List {

     /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeAllAhmed(list));
        System.out.println(removeAllAhmed2(list));
        System.out.println(removeAllAhmed3(list));
    }
    //SOLUTION 1
    public static List<String> removeAllAhmed(List<String>list){
        list.removeIf(p -> p.equals("Ahmed"));


        return list;
    }
    //SOLUTION 2
    public static List<String> removeAllAhmed2(List<String> names){

        names.removeAll(Arrays.asList("Ahmed"));

        return names;
    }
    //SOLUTION 3
    public static List<String> removeAllAhmed3(List<String> names){

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }
        return names;
    }




}
