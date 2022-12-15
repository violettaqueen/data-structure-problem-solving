import java.util.Arrays;

public class ArrayMultiplication {

    public static int[] arrayMultiplicationPrevWithNext(int[] array) {

        if (array.length < 2){
            return array;
        }
        int[] arrNew = new int[array.length];

        arrNew[0] = array[0] * array[1];
        arrNew[array.length - 1] = array[array.length - 1] * array[array.length - 2];

        for (int i = 1; i < array.length-1; i++) {

            arrNew[i] = array[i - 1] * array[i + 1];
        }
        return arrNew;
    }

    public static void main(String[] args) {


        int[] array = {2,3,4,5,6};
        int[] array2 = {2,3};
        System.out.println(Arrays.toString(arrayMultiplicationPrevWithNext(array2)));
    }
}
