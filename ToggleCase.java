public class ToggleCase {
    public static String toggleCase(String str) {
        if (str == null) return null;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'a' && ch <= 'z') {
                chars[i] = (char)(ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                chars[i] = (char)(ch + 32);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String test1 = "Hello World";
        System.out.println("Original: " + test1);
        System.out.println("Toggled:  " + toggleCase(test1));
    }
}