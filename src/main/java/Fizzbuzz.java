
public class Fizzbuzz {

    // 1 - 100
    // run a loop
    // condition if any number
    // 1 2 3fizz 4 5buzz 6fizz 7 8 9fizz 10buzz 11 12fizz 13 14 15fizzbuzz
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if ( i % 15 == 0){
                System.out.print("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            }else if (i % 3== 0){
                System.out.println("Fizz");
            }
            System.out.println(i + " ");

        }
    }


//    public static void fizzbuzz() {
//        int num = 100;
//        for (int i = 1; i <= 100; i++) {
//            if ( i % 3 == 0 ){
//                System.out.println(i + "fizz");
//            }
//        }
//
//    }


}
