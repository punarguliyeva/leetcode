public class LengthOfLastWord {
    public static void main(String[] args) {
        String text = "Hello World";
        int count = 0;
        int textLength = lengthOfLastWord(text, count);
        System.out.println("The last word length is " + textLength);
    }

    public static int lengthOfLastWord(String text, int count) {
        text = text.trim();
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}


//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.