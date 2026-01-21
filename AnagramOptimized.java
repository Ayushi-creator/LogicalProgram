public class AnagramOptimized {
    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32);
        }
        return ch;
    }
    public static boolean isAlphabet(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }
    public static boolean isAnagram(String str1, String str2) {

        int[] freq = new int[26];

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (char ch : chars1) {
            ch = toLowerCase(ch);
            if (isAlphabet(ch)) {
                freq[ch - 'a']++;
            }
        }
        for (char ch : chars2) {
            ch = toLowerCase(ch);
            if (isAlphabet(ch)) {
                freq[ch - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void checkAnagramDetailed(String str1, String str2) {
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);


        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count frequencies
        for (char ch : str1.toCharArray()) {
            ch = toLowerCase(ch);
            if (isAlphabet(ch)) {
                freq1[ch - 'a']++;
            }
        }

        for (char ch : str2.toCharArray()) {
            ch = toLowerCase(ch);
            if (isAlphabet(ch)) {
                freq2[ch - 'a']++;
            }
        }

        boolean result = isAnagram(str1, str2);
        System.out.println("\nResult: " + (result ? "ANAGRAMS " : "NOT ANAGRAMS "));
    }

    public static void main(String[] args) {
        checkAnagramDetailed("listen", "silent");

    }
}