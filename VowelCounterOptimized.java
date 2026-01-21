import java.util.HashSet;
import java.util.Set;

public class VowelCounterOptimized {

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i');
        vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I');
        vowels.add('O'); vowels.add('U');

        int count = 0;

        // Check each character
        for (char ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                count++;
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