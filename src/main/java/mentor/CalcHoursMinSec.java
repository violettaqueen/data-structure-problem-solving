package mentor;

public class CalcHoursMinSec {

    public static void main(String[] args) {

        int seconds =34200;
        int hours = seconds/3600;
        int minutes = (seconds % 3600) / 60;
        int secondsResult = (seconds % 60) % 60;
        System.out.println( hours);
        System.out.println( minutes);
        System.out.println( secondsResult);




    }
}
