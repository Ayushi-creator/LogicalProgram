public class PunctuationCounterBruteForce {

    public static int countPunctuations(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String punctuations = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < punctuations.length(); j++) {
                if (ch == punctuations.charAt(j)) {
                    count++;
                    break;
                }
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