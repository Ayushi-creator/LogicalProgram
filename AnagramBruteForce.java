public class AnagramBruteForce {
    public static void bubbleSort(char[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32);
        }
        return ch;
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();


        if (chars1.length != chars2.length) {
            return false;
        }
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = toLowerCase(chars1[i]);
        }
        for (int i = 0; i < chars2.length; i++) {
            chars2[i] = toLowerCase(chars2[i]);
        }
        bubbleSort(chars1);
        bubbleSort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Are Anagrams? " + isAnagram(str1, str2));

    }
}