package tasks;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10,0});
        list.add(new int[]{3,5});
        list.add(new int[]{2,5});

        System.out.println(countPassengers(list));

    }
    public static int countPassengers(ArrayList<int[]> stops){

        int numberOfPeople = 0;

        for (int i = 0; i < stops.size(); i++) {
            numberOfPeople = numberOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }
        return numberOfPeople;
    }
}
