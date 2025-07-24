public class PalindromeNumber {
    public static void main(String[] args) {
        boolean res = isPalindrome(13531);
        System.out.println(res);
    }

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
