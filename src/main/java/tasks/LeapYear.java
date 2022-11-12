package tasks;

public class LeapYear {

    public static boolean leapYear(int year){

        if (year % 4 == 0 && year % 100 != 0){
            return true;
        } else if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(leapYear(1988));
    }
}
