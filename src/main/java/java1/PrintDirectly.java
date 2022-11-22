package java1;

import java.util.Scanner;

public class PrintDirectly {

    public static void printDirectly5times(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (count < 5) {
                count = count + 1;

                System.out.println(str);
            }
        }
    }


    public static void main(String[] args) {

        String quote = "Be yourself. Everyone else is taken";

        printDirectly5times(quote);

        // while loop practice

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);


        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + "+" + number2 + "?");

        int sum = number1 + number2;
        int userAnswer = input.nextInt();

        while (sum != userAnswer) {
            System.out.println("Try again");
            userAnswer = input.nextInt();
        }
        System.out.println("You got it");
        System.out.println("********************************************");

        userAnswer = 0;

        do {
            System.out.println("What is " + number1 + "+" + number2 + "?");
            userAnswer = input.nextInt();
        } while (sum != userAnswer);
        System.out.println("You got it");
        input.close();

        System.out.println("Conditional flow in loops");

        int count = 0;
        while (count < 100){
            System.out.println("Welcome to Java");
            count ++;
        }


    }
}
