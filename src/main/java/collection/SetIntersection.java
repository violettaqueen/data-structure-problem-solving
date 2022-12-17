package collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetIntersection {

    public static void main(String[] args) {

/*
        return a Set equal to the intersection of the parameter Sets
     */
/*
            Please implement this method to
            return a Set equal to the intersection of the parameter Sets
            The method should not chage the content of the parameters.
        */
        Set<Object> num1 = new LinkedHashSet<>(Arrays.asList(1,2,3));
        Set<Object> num2 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(getIntersection(num1, num2));

    }
    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b){

        if (a.size() > b.size()){
            a.retainAll(b);
            return a;
        }else{
            b.retainAll(a);
            return b;
        }

    }





}
