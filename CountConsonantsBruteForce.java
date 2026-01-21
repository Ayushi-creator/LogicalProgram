public class CountConsonantsBruteForce {


    public static int countConsonants(String str) {
        char[] chars = str.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            if ((ch >= 'a' && ch <= 'z')) {

                if (ch != 'a' && ch != 'e' && ch != 'i' &&
                        ch != 'o' && ch != 'u') {
                    count++;
                    System.out.println("Consonant found: " + ch);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        int consonants = countConsonants(str);
        System.out.println("Total Consonants: " + consonants);

    }
}