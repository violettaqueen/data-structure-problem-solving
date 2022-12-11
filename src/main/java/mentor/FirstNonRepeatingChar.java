package mentor;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String word = "google";
        System.out.println(firstNonRepeatingChar(word));
    }

    public static int firstNonRepeatingChar(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
            }
            int frequency = 0;
            for (int j = 0; j < word.length() ; j++) {
                if (ch == word.charAt(j)){
                    frequency++;
            }
            }
            if(frequency == 1){
                return i;
            }
        }
        return -1;
    }


}

