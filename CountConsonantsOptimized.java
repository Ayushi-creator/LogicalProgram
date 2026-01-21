public class CountConsonantsOptimized {

    public static boolean isVowel(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        return (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u');
    }
    public static boolean isAlphabet(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }

    public static int countConsonants(String str) {
        char[] chars = str.toCharArray();
        int count = 0;

        for (char ch : chars) {
            if (isAlphabet(ch) && !isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void countConsonantsDetailed(String str) {
        char[] chars = str.toCharArray();
        int consonants = 0;
        int vowels = 0;
        int others = 0;

        System.out.println("String: " + str);
        System.out.println("\nAnalysis:");

        for (char ch : chars) {
            if (isAlphabet(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                    System.out.print(ch + " ");
                }
            } else {
                others++;
            }
        }

        System.out.println("\n\nStatistics:");
        System.out.println("Total Consonants: " + consonants);
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Other Characters: " + others);
    }

    public static void main(String[] args) {
        countConsonantsDetailed("Hello World");

    }
}