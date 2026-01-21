import java.util.HashSet;
import java.util.Set;

public class PunctuationCounterOptimized {

    public static int countPunctuations(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        Set<Character> punctuations = new HashSet<>();
        String punctuationStr = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

        for (char c : punctuationStr.toCharArray()) {
            punctuations.add(c);
        }

        int count = 0;
        for (char ch : str.toCharArray()) {
            if (punctuations.contains(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello, World! How are you? I'm fine; thanks.";

        int punctuationCount = countPunctuations(text);

        System.out.println("Input String: " + text);
        System.out.println("Total Punctuations: " + punctuationCount);
    }
}