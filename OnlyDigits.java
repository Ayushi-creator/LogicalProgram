public class OnlyDigits {
    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "123a45";

        System.out.println(str1 + " contains only digits: " + containsOnlyDigits(str1));
        System.out.println(str2 + " contains only digits: " + containsOnlyDigits(str2));
    }
}