package arrays_arraylist;

public class PrintUniqueNumbers {

    public static void printUnique(int[] numbers) {

        for (int each : numbers) {  //value

            int count = 0;

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }


        }
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3};
        printUnique(array);
    }
}
