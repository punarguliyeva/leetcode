public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) { // f,l,o,w,e,r
            char letter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { // flower,flow,flight
                if (i == strs[j].length() || strs[j].charAt(i) != letter) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}

