package palindrome;

public class Palindrome1 {

    public static void main(String[] args) {

        String word = "tacocat";
        System.out.println(isPalindrome(word));

    }
    public static boolean isPalindrome(String word){

        String reverse = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse += word.charAt(i);

            if (!word.contains(reverse)){
                return false;
            }

        }
        return true;
    }


}
