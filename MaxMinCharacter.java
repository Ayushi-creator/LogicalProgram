public class MaxMinCharacter {
    public static void findMaxMinChars(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Empty string");
            return;
        }
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        char maxChar = ' ', minChar = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char) i;
                }
                if (freq[i] < minFreq) {
                    minFreq = freq[i];
                    minChar = (char) i;
                }
            }
        }

        System.out.println("Maximum occurring character: '" + maxChar +
                "' with frequency " + maxFreq);
        System.out.println("Minimum occurring character: '" + minChar +
                "' with frequency " + minFreq);
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println("String: " + str);
        findMaxMinChars(str);
    }
}