public class ReverseWords {
    public static String reverseWords(String str) {
        if (str == null || str.length() == 0) return str;

        char[] chars = str.toCharArray();
        int n = chars.length;
        reverse(chars, 0, n - 1);

        int start = 0;
        for (int end = 0; end < n; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
        reverse(chars, start, n - 1);

        return new String(chars);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String str = "I Love Programming";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverseWords(str));
    }
}