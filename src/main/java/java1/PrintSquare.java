package java1;

public class PrintSquare {

    public static void main(String[] args) {
        int num = 6;
        printSquare(num);
        printTriangle(num);
        System.out.println();
        invertedTriangle(num);
        invertedPyramid(num);

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int k = 6 -i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }



    }

    public static void printSquare(int n) {

        for (int i = 0; i < n; i++) { //horizontal
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void invertedPyramid(int height) {

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 6 - i; k >= 1 ; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
