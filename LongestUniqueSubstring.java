import java.util.HashMap;

public class LongestUniqueSubstring {

    public static String findLongest(String str) {

        if (str == null || str.length() == 0)
            return "";

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int maxLen = 0;
        int maxStart = 0;

        for (int end = 0; end < str.length(); end++) {

            char ch = str.charAt(end);

            // If duplicate inside window
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }

            map.put(ch, end);

            // Update max window
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        // Create substring manually
        char[] result = new char[maxLen];

        for (int i = 0; i < maxLen; i++) {
            result[i] = str.charAt(maxStart + i);
        }

        return new String(result);
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println("String: " + str);
        System.out.println("Longest substring: " + findLongest(str));
    }
}
