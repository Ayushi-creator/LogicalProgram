public class StringReversal {
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}