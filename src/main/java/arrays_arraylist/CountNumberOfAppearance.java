package arrays_arraylist;

public class CountNumberOfAppearance {

    public static int countAppearance(String[] array, String word){

        int count = 0;

        for (String each : array){
            if (each.equals(word))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String[] arr = {"yes", "yes", "no"};
        String word = "yes";
        System.out.println(countAppearance(arr, word));
    }
}
