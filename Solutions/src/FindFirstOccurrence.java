
public class FindFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "asadbutsad";
        String needle = "sad";
        int index = findFirstOccurrence(haystack, needle);
        System.out.println("index: " + index);
    }

    public static int findFirstOccurrence(String haystack, String needle) {
        for (int i = 0; i <= haystack.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}