public class VowelCounterBruteForce {

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < vowels.length(); j++) {
                if (ch == vowels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello World! How are you?";

        int vowelCount = countVowels(text);

        System.out.println("Input String: " + text);
        System.out.println("Total Vowels: " + vowelCount);

    }
}