public class lengthOfLastWord {

    public static void main(String[] args) {

        String sentence = "word   ";
        System.out.println(lengthOfLastWordOfString(sentence));
    }

    public static int lengthOfLastWordOfString(String s) {

        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        if (i <= 0){
            return 0;
        }
            // we know that there are only characters left
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' '){
            i--;
            length++;
        }
        return length;
    }
}